import java.util.ArrayList;

public interface IFInstagram {

	public Comentarios comentar(int id_co, String texto, ArrayList<Curtidas> curtida,
			ArrayList<Compartilhar> compartilhar);

	public Compartilhar compartilhar(int ID_COM, String fotos, String musicas, String textos, String videos,
			String titulo);

	public Curtidas curtidas(int id_c, Postagens postagens, Comentarios comentarios);

	public Direct direct(int id_dir, String texto, Compartilhar arquivos);

	public Historia historia(int ID_H, String titulo, Usuario usuario, String respostas);

	public Postagens postagens(int ID_PO, ArrayList<Comentarios> comentarios, ArrayList<Curtidas> curtidas,
			String fotos, String musicas, String textos, String videos, String titulo);

	public Usuario usuario(int id, String nome, ArrayList<Historia> historias, Postagens postagens,
			Comentarios comentarios, Curtidas curtidas);
}
