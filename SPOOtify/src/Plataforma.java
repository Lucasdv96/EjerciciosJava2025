import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Plataforma {
    HashSet<Cancion> canciones = new HashSet<>();

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }


    public Cancion BuscarCancionPorId(String idCancion) {
        for (Cancion c : canciones) {
            if (c.getId().equalsIgnoreCase(idCancion)) {
                return c;
            }

        }
        throw new ExceNegocio("La cancion no existe");
    }

    public Cancion cancionMasReproducida() {
        return canciones.stream().max(Comparator.comparingInt(Cancion::getCantReproducciones)).orElse(null);
    }

    public HashSet getArtistas() {
        HashSet<String> artistas = new HashSet<>();
        return (HashSet) canciones
                .stream()
                .map(cancion -> cancion.getNombreArtista())
                .collect(Collectors.toSet());
    }
}
