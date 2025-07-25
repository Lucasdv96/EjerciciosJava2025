import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Carrito {

    private List<Producto> productos = new ArrayList<>();
    private HashSet<Cupon> cupones = new HashSet<>();
    private String nombre;
    private boolean esEnviable;




    public void agregarProducto(Producto producto){
        if(producto.sePuedeAgregar(this)){
            productos.add(producto);
        }
    }

    public void agregarCupon(Cupon cupon){
        cupones.add(cupon);
    }


    public double aplicarCupon(){
        double total= 0;
        for(Cupon c : cupones){
            total += c.aplicarCupon(this);
        }
        return total;
    }

    public double total(){
        double total= 0;
        for(Producto p : productos){
            total += p.getPrecio();
        }
        return total - aplicarCupon();
    }

    public void vaciarCarrito(){
        productos.clear();
        cupones.clear();

    }
    public List<Producto> getProductos() {
        return productos;
    }



    public void setNombre(String nombre) {
        if(nombre == null){
            this.nombre = nombre;
        }
    }
}
