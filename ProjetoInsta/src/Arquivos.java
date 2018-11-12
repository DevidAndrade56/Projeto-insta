
public class Arquivos {
	private int id_A;
	private String fotos;
	private String musicas;
	private String textos;
	private String videos;
	private String titulo;
	private Usuario usuario;

	public int getId_A() {
		return id_A;
	}

	public void setId_A(int id_A) {
		this.id_A = id_A;
	}

	public String getFotos() {
		return fotos;
	}

	@Override
	public String toString() {
		return "Arquivos [id_A=" + id_A + ", fotos=" + fotos + ", musicas=" + musicas + ", textos=" + textos
				+ ", videos=" + videos + ", titulo=" + titulo + ", usuario=" + usuario + "]";
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
