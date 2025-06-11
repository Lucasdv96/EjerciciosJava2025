import java.util.HashSet;

public class Propietario {
    private final int cuit;
    private final String nombre;
    private HashSet<CentralEnergetica> centralEnergeticas = new HashSet<>();


    public Propietario(int cuit, String nombre) {
        this.cuit = cuit;
        this.nombre = nombre;
    }

    public void agregarCentrales(CentralEnergetica centralEnergetica){
        centralEnergeticas.add(centralEnergetica);
    }

}
