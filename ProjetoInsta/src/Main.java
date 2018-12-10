import java.util.HashSet;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		DAO<Usuario> dao = new DAO<Usuario>();
		Usuario u = new Usuario();
		u.setNome("HugoFF");
		dao.save(u);
		
		Usuario u2 = new Usuario();
		u2.setNome("Hugo");
		dao.save(u2);
		
		Usuario find = dao.find(Usuario.class, u2.getId());
		System.out.println(find.getNome());
	
		DAO <Postagens> Pao= new DAO<Postagens>();
		Postagens p = new Postagens();
		HashSet<Comentarios> comentarios = new HashSet<Comentarios>();
		comentarios.add(new Comentarios());
		p.setComentarios(comentarios);
		
		Postagens find1 = Pao.find(Postagens.class, u2.getId());
		
		DAO <Historia> Cao= new DAO<Historia>();
		Postagens c = new Postagens();
		HashSet<Historia> H = new HashSet<Historia>();
		p.setComentarios(comentarios);
		
		
	}
}


