import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Comentarios")
public class Comentarios {
	@Id
	@GeneratedValue
	private int id_co;
	private String texto;
	@ManyToMany
	@JoinTable(name="curtidas_usuarios",
	joinColumns = @JoinColumn(name="id"),
	inverseJoinColumns = @JoinColumn(name="id_c"))
	private ArrayList<Curtidas> curtida;

	public int getId_co() {
		return id_co;
	}

	public void setId_co(int id_co) {
		this.id_co = id_co;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public ArrayList<Curtidas> getCurtida() {
		return curtida;
	}

	public void setCurtida(ArrayList<Curtidas> curtida) {
		this.curtida = curtida;
	}

	@Override
	public String toString() {
		return "Comentarios [id_co=" + id_co + ", texto=" + texto + ", curtida=" + curtida + "]";
	}

	public Comentarios(int id_co, String texto, ArrayList<Curtidas> curtida) {
		super();
		this.id_co = id_co;
		this.texto = texto;
		this.curtida = curtida;
	}


}
