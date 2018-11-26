import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Direct {
	@Id
	@GeneratedValue
	private Long id_dir;
	private String texto;


	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	@Override
	public String toString() {
		return "Direct [id_dir=" + id_dir + ", texto=" + texto + "]";
	}
	
	public Direct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId_dir() {
		return id_dir;
	}
	public void setId_dir(Long id_dir) {
		this.id_dir = id_dir;
	}
	public Direct(Long id_dir, String texto) {
		super();
		this.id_dir = id_dir;
		this.texto = texto;
	}

}