public class CuponProducto extends Cupon{
    private double descuento;
    private Producto producto;

    public CuponProducto(String nombre, int descuento, Producto producto) {
        super(nombre);
        this.descuento = descuento;
        this.producto = producto;
    }

    @Override
    public int aplicarCupon(Carrito carrito) {
        int total = 0;
        for(Producto p: carrito.getProductos()){
            if(p == producto){
                total += p.getPrecio() - descuento;
            }
        }
        return total;
    }
}
