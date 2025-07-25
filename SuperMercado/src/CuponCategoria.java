public class CuponCategoria extends Cupon{
    private Categoria categoria;
    private double descuento;

    public CuponCategoria(String nombre, Categoria categoria, double descuento) {
        super(nombre);
        this.categoria = categoria;
        this.descuento = descuento;
    }

    @Override
    public double aplicarCupon(Carrito carrito) {
        double total = 0;
        for (Producto p : carrito.getProductos()) {
            if (p.getCategoria() == categoria) {
                total += p.getPrecio() * descuento;
            }
        }
        return total;
    }
}
