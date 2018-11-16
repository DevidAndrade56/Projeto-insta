import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	@ManyToMany
	@JoinColumn(name = "ID_H")
	private ArrayList<Historia> historias;
	@OneToMany
	private Postagens postagens;
	@OneToMany
	private Comentarios comentarios;
	@OneToMany
	private Curtidas curtidas;

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

	public Curtidas getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Curtidas curtidas) {
		this.curtidas = curtidas;
	}

	public Usuario(int id, String nome, ArrayList<Historia> historias,
			Postagens postagens, Comentarios comentarios, Curtidas curtidas) {
		super();
		this.id = id;
		this.nome = nome;
		this.historias = historias;
		this.postagens = postagens;
		this.comentarios = comentarios;
		this.curtidas = curtidas;
	}

	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + " historias=" + historias
				+ ", postagens=" + postagens + ", comentarios=" + comentarios + ", curtidas=" + curtidas + "]";
	}

}
