import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Compartilhar")
public class Compartilhar {
	@Id
	@GeneratedValue
	private Long ID_COM;
	private String fotos;
	private String musicas;
	private String textos;
	private String videos;
	private String titulo;


	public Long getID_COM() {
		return ID_COM;
	}

	public void setID_COM(Long iD_COM) {
		ID_COM = iD_COM;
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

	@Override
	public String toString() {
		return "Compartilhar [ID_COM=" + ID_COM + ", fotos=" + fotos + ", musicas=" + musicas + ", textos=" + textos
				+ ", videos=" + videos + ", titulo=" + titulo + "]";
	}

	

	public Compartilhar(Long iD_COM, String fotos, String musicas, String textos, String videos, String titulo) {
		super();
		ID_COM = iD_COM;
		this.fotos = fotos;
		this.musicas = musicas;
		this.textos = textos;
		this.videos = videos;
		this.titulo = titulo;
	}

	public Compartilhar() {
		super();
		// TODO Auto-generated constructor stub
	}

}
