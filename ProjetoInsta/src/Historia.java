import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Historia implements Identificavel{
	@Id
	@GeneratedValue
	private Long ID_H;
	private String titulo;
	@ManyToMany(mappedBy="historias")
	private Set<Usuario> usuario;
	private String respostas;
	
	@Override
	public String toString() {
		return "Historia [ID_H=" + ID_H + ", titulo=" + titulo + ", usuario=" + usuario + ", respostas=" + respostas
				+  "]";
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Set<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Set<Usuario> usuario) {
		this.usuario = usuario;
	}

	public String getRespostas() {
		return respostas;
	}

	public void setRespostas(String respostas) {
		this.respostas = respostas;
	}


	public Long getID_H() {
		return ID_H;
	}


	public void setID_H(Long iD_H) {
		ID_H = iD_H;
	}


	public Historia() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Historia(Long iD_H, String titulo, Set<Usuario> usuario, String respostas) {
		super();
		ID_H = iD_H;
		this.titulo = titulo;
		this.usuario = usuario;
		this.respostas = respostas;
	}



	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

	

}
