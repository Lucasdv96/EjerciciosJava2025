import java.util.ArrayList;
import java.util.HashSet;

public class Carrito {
    private Cliente cliente;
    private ArrayList<Producto> productos = new ArrayList<>();
    private HashSet<Cupon> cupons = new HashSet<>();


    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto){
        if(producto.sePuedeAgregar(this)){
            productos.add(producto);
        }
    }

    public int calcularTotalProducto(){
        return productos.stream().mapToInt(Producto::getPrecio).sum();
    }
}
