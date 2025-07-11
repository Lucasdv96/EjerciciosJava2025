public abstract class Habitante {
    private int edad;
    private String nombre;
    private Domicilio domicilio;

    @Override
    public String toString() {
        return nombre;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public abstract boolean puedeRecibirRegalo();

}
