import java.util.HashSet;

public class Grupo {
    private int presupuestoMaximo;
    private HashSet<Viajero> viajeros = new HashSet<>();
    private Paquete paquete;

    public Grupo(Paquete paquete,int presupuestoMaximo) {
        this.paquete = paquete;
        this.presupuestoMaximo = presupuestoMaximo;
    }

    public void setPresupuestoMaximo(int presupuestoMaximo) {
        this.presupuestoMaximo = presupuestoMaximo;
    }

    public void agregarViajero(Viajero viajero){
        viajeros.add(viajero);
    }

    public void removerViajero(Viajero viajero){
        viajeros.remove(viajero);
    }

    public HashSet<Viajero> getViajeros() {
        return viajeros;
    }

}
