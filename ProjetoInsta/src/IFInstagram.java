import java.util.ArrayList;

public interface IFInstagram {

	public Comentarios comentar(Comentarios c)throws ComentInvalidoException;

	public Compartilhar compartilhar(int ID_COM, String fotos, String musicas, String textos, String videos,String titulo);

	public Curtidas curtidas(int id_c, Postagens postagens, Comentarios comentarios);

	public Direct direct(int id_dir, String texto, Compartilhar arquivos);

	public Historia historia(int ID_H, String titulo, Usuario usuario, String respostas);

	public Postagens postagens(Postagens p)throws PostInvalidoException;

	public Usuario usuario(Usuario u) throws UsuarioInvalidoException;
}
