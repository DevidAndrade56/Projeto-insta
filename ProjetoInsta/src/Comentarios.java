import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Comentarios")
public class Comentarios {
	@Id
	private int id_co;
	private String texto;
	@ManyToMany
	private ArrayList<Curtidas> curtida;
	@ManyToMany
	private ArrayList<Compartilhar> compartilhar;

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
		return "Comentarios [id_co=" + id_co + ", texto=" + texto + ", curtida=" + curtida + ", compartilhar="
				+ compartilhar + "]";
	}

	public ArrayList<Compartilhar> getCompartilhar() {
		return compartilhar;
	}

	public void setCompartilhar(ArrayList<Compartilhar> compartilhar) {
		this.compartilhar = compartilhar;
	}

}
