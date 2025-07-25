public class CuponProducto extends Cupon{
    private Producto producto;
    private double descuento;

    public CuponProducto(String nombre, Producto producto, double descuento) {
        super(nombre);
        this.producto = producto;
        this.descuento = descuento;
    }

    @Override
    public double aplicarCupon(Carrito carrito) {
        double total = 0;
        for(Producto p : carrito.getProductos()){
            if(producto == p){
                total += descuento;
            }
        }

        return total;
    }
}
