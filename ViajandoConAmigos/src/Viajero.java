public class Viajero {
    private String nombre;
    private int edad;

    public Viajero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    @Override
    public String toString() {
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

}
