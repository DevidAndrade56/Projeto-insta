import java.util.ArrayList;

public class Usuario {
	
	private int id;
	private String nome;
	private ArrayList<Arquivos> arquivos;
	private ArrayList<Historia> historias;
	private Conta conta;
	private Perfil perfil;
	private Postagens postagens;
	private Comentarios comentarios;
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

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
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

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", arquivos=" + arquivos + ", historias=" + historias
				+ ", conta=" + conta + ", perfil=" + perfil + ", postagens=" + postagens + ", comentarios="
				+ comentarios + ", curtidas=" + curtidas + "]";
	}

	public ArrayList<Arquivos> getArquivos() {
		return arquivos;
	}

	public void setArquivos(ArrayList<Arquivos> arquivos) {
		this.arquivos = arquivos;
	}

}
