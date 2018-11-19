import java.util.Set;

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
	private Set<Postagens> postagens;
	@ManyToOne
	private Set<Comentarios> comentarios;

	public int getId_c() {
		return id_c;
	}

	public void setId_c(int id_c) {
		this.id_c = id_c;
	}

	public Set<Postagens> getPostagens() {
		return postagens;
	}

	public void setPostagens(Set<Postagens> postagens) {
		this.postagens = postagens;
	}

	public Set<Comentarios> getComentarios() {
		return comentarios;
	}

	public void setComentarios(Set<Comentarios> comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Curtidas [id_c=" + id_c + ", postagens=" + postagens + ", comentarios=" + comentarios + "]";
	}

}
