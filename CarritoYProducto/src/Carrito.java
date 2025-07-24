import java.util.ArrayList;
import java.util.HashSet;

public class Carrito {
    private Cliente cliente;
    private ArrayList<Producto> productos = new ArrayList<>();
    private HashSet<Cupon> cupons = new HashSet<>();

    public Carrito(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto){
        if(producto.sePuedeAgregar(this)){
            productos.add(producto);
        }
    }

    public double calcularTotalProducto(){
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public String conocerNombreCliente() {
        return  cliente.getNombre();
    }

}
