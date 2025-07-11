import java.util.HashSet;

public class Barrio {
    private HashSet<Domicilio> domicilios = new HashSet<>();
    private String nombre;

    public Barrio(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDomicilio(Domicilio domicilio){
        domicilios.add(domicilio);
    }
}
