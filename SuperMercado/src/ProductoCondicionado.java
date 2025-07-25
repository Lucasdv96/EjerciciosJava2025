public class ProductoCondicionado extends Producto{
    private int limite;

    public ProductoCondicionado(String nombre, double precio, Categoria categoria, String descripcion,int limite) {
        super(nombre, precio, categoria, descripcion);
        this.limite = limite;
    }

    @Override
    public boolean sePuedeAgregar(Carrito carrito) {
        int apariciones = 0;
        for (Producto p : carrito.getProductos()){
            if(p == this){
                apariciones++;
            }
        }
        return apariciones < limite;
    }
}
