public class ProductoAsociado extends Producto{
    public ProductoAsociado(String nombre, double precio, Categoria categoria, String descripcion, Producto productoAsociado) {
        super(nombre, precio, categoria, descripcion);
        this.productoAsociado = productoAsociado;
    }

    private Producto productoAsociado;
    @Override
    public boolean sePuedeAgregar(Carrito carrito) {
        for(Producto p : carrito.getProductos()){
            if(p == productoAsociado){
                return true;
            }
        }
        return false;
    }
}
