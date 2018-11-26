import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Comentarios {
	@Id
	@GeneratedValue
	private Long id_co;
	private String texto;
	@ManyToMany
	@JoinTable(name="curtidas_usuarios",
	joinColumns = @JoinColumn(name="id"),
	inverseJoinColumns = @JoinColumn(name="id_c"))
	private Set<Curtidas> curtida;
	public Long getId_co() {
		return id_co;
	}
	public void setId_co(Long id_co) {
		this.id_co = id_co;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Set<Curtidas> getCurtida() {
		return curtida;
	}
	public void setCurtida(Set<Curtidas> curtida) {
		this.curtida = curtida;
	}
	@Override
	public String toString() {
		return "Comentarios [id_co=" + id_co + ", texto=" + texto + ", curtida=" + curtida + "]";
	}
	public Comentarios(Long id_co, String texto, Set<Curtidas> curtida) {
		super();
		this.id_co = id_co;
		this.texto = texto;
		this.curtida = curtida;
	}
	public Comentarios() {
		super();
		// TODO Auto-generated constructor stub
	}



}
