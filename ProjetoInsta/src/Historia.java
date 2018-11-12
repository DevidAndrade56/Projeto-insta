import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Historia {
	@Id
	@GeneratedValue
	private int ID_H;
	private String titulo;
	
	private Usuario usuario;
	private String respostas;
	
	private Arquivos arquivos;

	@Override
	public String toString() {
		return "Historia [ID_H=" + ID_H + ", titulo=" + titulo + ", usuario=" + usuario + ", respostas=" + respostas
				+ ", arquivos=" + arquivos + "]";
	}

	public int getID_H() {
		return ID_H;
	}

	public void setID_H(int iD_H) {
		ID_H = iD_H;
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

	public String getRespostas() {
		return respostas;
	}

	public void setRespostas(String respostas) {
		this.respostas = respostas;
	}

	public Arquivos getArquivos() {
		return arquivos;
	}

	public void setArquivos(Arquivos arquivos) {
		this.arquivos = arquivos;
	}

}
