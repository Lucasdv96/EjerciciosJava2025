public abstract class Cupon {
    private String nombre;

    public Cupon(String nombre) {
        this.nombre = nombre;
    }

    public abstract double aplicarCupon(Carrito carrito);
}
