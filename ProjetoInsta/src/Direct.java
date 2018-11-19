import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Direct {
	@Id
	@GeneratedValue
	private int id_dir;
	private String texto;
	@OneToOne
	private Set<Compartilhar> arquivos;

	public int getId_dir() {
		return id_dir;
	}

	public void setId_dir(int id_dir) {
		this.id_dir = id_dir;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	

	public Set<Compartilhar> getCompartilhar() {
		return arquivos;
	}

	public void setCompartilhar(Set<Compartilhar> compartilhar) {
		this.arquivos = compartilhar;
	}

	@Override
	public String toString() {
		return "Direct [id_dir=" + id_dir + ", texto=" + texto + ", arquivos=" + arquivos + "]";
	}

}
