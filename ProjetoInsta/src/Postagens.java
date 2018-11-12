import java.util.ArrayList;

public class Postagens {
	private int ID_PO;
	private ArrayList<Comentarios> comentarios;
	private ArrayList<Curtidas> curtidas;
	private String fotos;
	private String musicas;
	private String textos;
	private String videos;
	private String titulo;

	public int getID_PO() {
		return ID_PO;
	}

	public void setID_PO(int iD_PO) {
		ID_PO = iD_PO;
	}

	@Override
	public String toString() {
		return "Postagens [ID_PO=" + ID_PO + ", comentarios=" + comentarios + ", curtidas=" + curtidas + ", fotos="
				+ fotos + ", musicas=" + musicas + ", textos=" + textos + ", videos=" + videos + ", titulo=" + titulo
				+ "]";
	}

	public ArrayList<Comentarios> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<Comentarios> comentarios) {
		this.comentarios = comentarios;
	}

	public ArrayList<Curtidas> getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(ArrayList<Curtidas> curtidas) {
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

}