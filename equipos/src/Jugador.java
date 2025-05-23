public class Jugador {
    public String nombre;
    public boolean existe;

    public Jugador(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
