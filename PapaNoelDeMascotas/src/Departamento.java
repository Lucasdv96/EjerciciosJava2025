public class Departamento extends Domicilio {
    private boolean ventanaAbierta;

    public Departamento(boolean visitable, Barrio barrio) {
        super(visitable, barrio);
    }


    @Override
    public boolean esVisitable() {
        return ventanaAbierta;
    }
}
