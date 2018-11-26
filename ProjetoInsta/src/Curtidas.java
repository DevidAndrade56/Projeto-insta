import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Curtidas")
public class Curtidas {
	@Id
	@GeneratedValue
	private Long id_c;
	@ManyToMany
	@JoinTable(name="postagens_usuarios",
	joinColumns =@JoinColumn(name="id"),
	inverseJoinColumns = @JoinColumn(name="ID_PO"))
	private Set<Postagens> postagens;
	
	@ManyToMany
	@JoinTable(name="comentarios_usuarios",
	joinColumns =@JoinColumn(name="id_co"),
	inverseJoinColumns = @JoinColumn(name="id"))
	
	private Set<Comentarios> comentarios;


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

	public Long getId_c() {
		return id_c;
	}

	public void setId_c(Long id_c) {
		this.id_c = id_c;
	}

	@Override
	public String toString() {
		return "Curtidas [id_c=" + id_c + ", postagens=" + postagens + ", comentarios=" + comentarios + "]";
	}

	public Curtidas() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
