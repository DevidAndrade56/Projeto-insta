public class InstagramIF implements IFInstagram {

	@Override
	public Usuario usuario(Usuario u) throws UsuarioInvalidoException {
		DAO<Usuario> dao = new DAO<Usuario>();
		if (u == null) {
			throw new UsuarioInvalidoException();
		} else {
			dao.save(u);
			return dao.find(Usuario.class, u.getId());
		}
	}

	@Override
	public Comentarios comentar(Comentarios c) throws ComentInvalidoException {
		DAO<Comentarios> dao = new DAO<Comentarios>();
		if (c == null) {
			throw new ComentInvalidoException();
		} else {
			dao.save(c);
			return dao.find(Comentarios.class, c.getId());
		}
	}
	@Override
	public Postagens postagens(Postagens p) throws PostInvalidoException  {
		DAO<Postagens> dao = new DAO<Postagens>();
		if (p == null) {
			throw new PostInvalidoException();
		} else {
			dao.save(p);
			return dao.find(Postagens.class, p.getId());
		}
	}
	@Override
	public Compartilhar compartilhar(int ID_COM, String fotos, String musicas, String textos, String videos,
			String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curtidas curtidas(int id_c, Postagens postagens, Comentarios comentarios) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Direct direct(int id_dir, String texto, Compartilhar arquivos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Historia historia(int ID_H, String titulo, Usuario usuario, String respostas) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	}

