import java.util.ArrayList;

public class Perfil {
	private int ID_PE;
	private String descrição;
	private ArrayList<Usuario> usuario;
	private ArrayList<Direct> direct;

	public int getID_PE() {
		return ID_PE;
	}

	public void setID_PE(int iD_PE) {
		ID_PE = iD_PE;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}

	public ArrayList<Direct> getDirect() {
		return direct;
	}

	public void setDirect(ArrayList<Direct> direct) {
		this.direct = direct;
	}

	@Override
	public String toString() {
		return "Perfil [ID_PE=" + ID_PE + ", descrição=" + descrição + ", usuario=" + usuario + ", direct=" + direct
				+ "]";
	}

}
