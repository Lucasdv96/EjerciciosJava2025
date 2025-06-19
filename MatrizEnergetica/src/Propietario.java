import java.util.HashSet;

public class Propietario {
    private final int cuit;
    private final String nombre;
    private HashSet<CentralEnergetica> centralEnergeticas = new HashSet<>();

    @Override
    public String toString() {
        return "Propietario{" +
                "cuit=" + cuit +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public Propietario(int cuit, String nombre) {
        this.cuit = cuit;
        this.nombre = nombre;
    }

    public void agregarCentrales(CentralEnergetica centralEnergetica){
        centralEnergeticas.add(centralEnergetica);
    }

    public HashSet<CentralEnergetica> getCentralEnergeticas() {
        return centralEnergeticas;
    }
}
