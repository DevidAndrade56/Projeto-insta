import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Postagens {
	@Id
	@GeneratedValue
	private Long ID_PO;
	@ManyToMany
	@JoinTable(name="usuario_comentarios",
	joinColumns = @JoinColumn(name="id"),
	inverseJoinColumns = @JoinColumn(name="id_co"))
	private Set<Comentarios> comentarios;
	@ManyToMany
	@JoinTable(name="curtidas_usuarios",
	joinColumns = @JoinColumn(name="id"),
	inverseJoinColumns = @JoinColumn(name="id_c"))
	private Set<Curtidas> curtidas;
	private String fotos;
	private String musicas;
	private String textos;
	private String videos;
	private String titulo;

	
	@Override
	public String toString() {
		return "Postagens [ID_PO=" + ID_PO + ", comentarios=" + comentarios + ", curtidas=" + curtidas + ", fotos="
				+ fotos + ", musicas=" + musicas + ", textos=" + textos + ", videos=" + videos + ", titulo=" + titulo
				+ "]";
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

	public String getFotos() {
		return fotos;
	}

	public void setFotos(String fotos) {
		this.fotos = fotos;
	}

	public String getMusicas() {
		return musicas;
	}

	public void setMusicas(String musicas) {
		this.musicas = musicas;
	}

	public String getTextos() {
		return textos;
	}

	public void setTextos(String textos) {
		this.textos = textos;
	}

	public String getVideos() {
		return videos;
	}

	public void setVideos(String videos) {
		this.videos = videos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Postagens() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getID_PO() {
		return ID_PO;
	}

	public void setID_PO(Long iD_PO) {
		ID_PO = iD_PO;
	}

	public Postagens(Long iD_PO, Set<Comentarios> comentarios, Set<Curtidas> curtidas, String fotos, String musicas,
			String textos, String videos, String titulo) {
		super();
		ID_PO = iD_PO;
		this.comentarios = comentarios;
		this.curtidas = curtidas;
		this.fotos = fotos;
		this.musicas = musicas;
		this.textos = textos;
		this.videos = videos;
		this.titulo = titulo;
	}

	}


