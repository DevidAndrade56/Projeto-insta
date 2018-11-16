import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Curtidas")
public class Curtidas {
	@Id
	@GeneratedValue
	private int id_c;
	@ManyToOne
	private Postagens postagens;
	@ManyToOne
	private Comentarios comentarios;

	public int getId_c() {
		return id_c;
	}

	public void setId_c(int id_c) {
		this.id_c = id_c;
	}

	public Postagens getPostagens() {
		return postagens;
	}

	public void setPostagens(Postagens postagens) {
		this.postagens = postagens;
	}

	public Comentarios getComentarios() {
		return comentarios;
	}

	public void setComentarios(Comentarios comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Curtidas [id_c=" + id_c + ", postagens=" + postagens + ", comentarios=" + comentarios + "]";
	}

}
