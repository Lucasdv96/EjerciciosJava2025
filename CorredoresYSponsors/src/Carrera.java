import java.util.HashSet;

public abstract class Carrera {
    private final String nombre;
    private final int distancia;

    protected HashSet<Corredor> corredores = new HashSet<>();

    public Carrera(int distancia, String nombre) {
        this.distancia = distancia;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "corredores=" + corredores +
                '}';
    }

    protected void inscribirCorredor(Corredor corredor){
        corredores.add(corredor);
    }


    public int getDistancia() {
        return distancia;
    }

    protected void sumarPuntos(Corredor corredor){
        corredor.sumarCantPuntos(0);
    }

    protected int obtenerCantCorredores(){
        return corredores.size();
    }
}
