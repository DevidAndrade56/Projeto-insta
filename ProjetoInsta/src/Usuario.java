import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	@ManyToMany
	@JoinTable(name="usuario_historias",
	joinColumns = @JoinColumn(name="id"),
	inverseJoinColumns = @JoinColumn(name="ID_H"))
	private ArrayList<Historia> historias;
	@OneToMany
	@JoinColumn(name="ID_PO")
	private Set<Postagens> postagens;
	@OneToMany
	@JoinColumn(name="id_co")
	private Set<Comentarios> comentarios;
	@OneToMany
	@JoinColumn(name="id_c")
	private Set<Curtidas> curtidas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Historia> getHistorias() {
		return historias;
	}

	public void setHistorias(ArrayList<Historia> historias) {
		this.historias = historias;
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

	public Set<Curtidas> getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Set<Curtidas> curtidas) {
		this.curtidas = curtidas;
	}

	@SuppressWarnings("unchecked")
	public Usuario(int id, String nome, ArrayList<Historia> historias,
			Postagens postagens, Comentarios comentarios, Curtidas curtidas) {
		super();
		this.id = id;
		this.nome = nome;
		this.historias = historias;
		this.postagens = (Set<Postagens>) postagens;
		this.comentarios = (Set<Comentarios>) comentarios;
		this.curtidas = (Set<Curtidas>) curtidas;
	}

	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + " historias=" + historias
				+ ", postagens=" + postagens + ", comentarios=" + comentarios + ", curtidas=" + curtidas + "]";
	}

}
