import java.util.ArrayList;

public interface IFInstagram {
	public Arquivos arquivos(int id_A, String fotos, String musicas, String textos, String videos, String titulo,
			Usuario usuario);

	public Comentarios comentar(int id_co, String texto, ArrayList<Curtidas> curtida,
			ArrayList<Compartilhar> compartilhar);

	public Compartilhar compartilhar(int ID_COM, String fotos, String musicas, String textos, String videos,
			String titulo);

	public Conta conta(int id_CO, String nome_ident, ArrayList<Postagens> postagens, String sobre, Perfil perfil);

	public Curtidas curtidas(int id_c, Postagens postagens, Comentarios comentarios);

	public Direct direct(int id_dir, String texto, Perfil perfil, Compartilhar arquivos);

	public Historia historia(int ID_H, String titulo, Usuario usuario, String respostas, Arquivos arquivos);

	public Perfil perfil(int ID_PE, String descrição, ArrayList<Usuario> usuario, ArrayList<Direct> direct);

	public Postagens postagens(int ID_PO, ArrayList<Comentarios> comentarios, ArrayList<Curtidas> curtidas,
			String fotos, String musicas, String textos, String videos, String titulo);

	public Usuario usuario(int id, String nome, ArrayList<Arquivos> arquivos, ArrayList<Historia> historias,
			Conta conta, Perfil perfil, Postagens postagens, Comentarios comentarios, Curtidas curtidas);
}
