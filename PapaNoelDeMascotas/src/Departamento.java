public class Departamento extends Domicilio {
    private boolean ventanaAbierta;

    public Departamento(boolean ventanaAbierta) {
        this.ventanaAbierta = ventanaAbierta;
    }

    @Override
    public boolean esVisitable() {
        return ventanaAbierta;
    }
}
