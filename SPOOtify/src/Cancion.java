import java.util.HashSet;
import java.util.stream.Collectors;

public class Cancion {
    private final String nombreArtista;
    private final String titulo;
    private final String id;

    private int cantReproducciones;
    private int cantLikes;

    private HashSet<Usuario> usuariosOyentes = new HashSet<>();
    private HashSet<Usuario> usuariosLike = new HashSet<>();

    @Override
    public String toString() {
        return "Cancion{" +
                "nombreArtista='" + nombreArtista + '\'' +
                ", titulo='" + titulo + '\'' +
                ", id=" + id +
                ", usuariosOyentes=" + usuariosOyentes +
                ", usuariosLike=" + usuariosLike +
                '}';
    }

    public Cancion(String nombreArtista, String titulo, String id) {
        this.nombreArtista = nombreArtista;
        this.titulo = titulo;
        this.id = id;
    }

    //GETTERS
    public int getCantReproducciones(){
        return cantReproducciones;
    }

    public String getId() {
        return id;
    }

    public int getCantLikes(){
        return cantLikes;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void reproducirCanciones(Usuario usuario){
        usuariosOyentes.add(usuario);
        cantReproducciones ++;
    }

    public void darLike(Usuario usuario){
        if(usuariosOyentes.contains(usuario) && !usuariosLike.contains(usuario)){
            usuariosLike.add(usuario);
            cantLikes ++;
        }else throw new ExceNegocio("No puede dar like");
    }

    public HashSet<Usuario> getUsuariosOyentes(){
        return usuariosOyentes;
    }
}
