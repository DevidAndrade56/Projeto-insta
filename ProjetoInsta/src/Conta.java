import java.util.ArrayList;

public class Conta {
	private int id_CO;
	private String nome_ident;
	private ArrayList<Postagens> postagens;
	private String sobre;
	private Perfil perfil;

	public int getId_CO() {
		return id_CO;
	}

	public void setId_CO(int id_CO) {
		this.id_CO = id_CO;
	}

	public String getNome_ident() {
		return nome_ident;
	}

	public void setNome_ident(String nome_ident) {
		this.nome_ident = nome_ident;
	}

	public ArrayList<Postagens> getPostagens() {
		return postagens;
	}

	public void setPostagens(ArrayList<Postagens> postagens) {
		this.postagens = postagens;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Conta [id_CO=" + id_CO + ", nome_ident=" + nome_ident + ", postagens=" + postagens + ", sobre=" + sobre
				+ ", perfi=" + perfil + "]";
	}

}
