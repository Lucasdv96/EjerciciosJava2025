public class Domicilio {
    private String direccion;
    public boolean fueVisitado;


    @Override
    public String toString() {
        return "direccion='" + direccion ;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean fueVisitado() {
        return false;
    }
}
