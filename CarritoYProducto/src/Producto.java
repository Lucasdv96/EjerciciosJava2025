public class Producto {
    private String nombre;
    private double precio;
    private Categoria categoria;
    private String descripcion;

    public Producto(String nombre, double precio, Categoria categoria, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public boolean sePuedeAgregar(Carrito carrito){
        return true;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }
}
