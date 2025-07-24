public class ProductoAsociado extends Producto{
    private Producto producto;

    public ProductoAsociado(String nombre, double precio, Categoria categoria, String descripcion, Producto producto) {
        super(nombre, precio, categoria, descripcion);
        this.producto = producto;
    }

    @Override
    public boolean sePuedeAgregar(Carrito carrito) {
        for(Producto p : carrito.getProductos()){
            if(producto == p){
                return true;
            }
        }return  false;
    }
}
