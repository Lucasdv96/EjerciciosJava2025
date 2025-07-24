package DELVALLE_1140171.src;

import java.util.ArrayList;
import java.util.HashSet;

public class Carrito {
    private Cliente cliente;
    private ArrayList<Producto> productos = new ArrayList<>();
    private HashSet<Cupon> cupones = new HashSet<>();

    public Carrito(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public HashSet<Cupon> getCupones() {
        return cupones;
    }

    public String conocerNombreCliente(){//PUNTO 1
        return cliente.getNombre();
    }

    public void vaciarCarrito(){ //PUNTO 1
        productos.clear();
        cupones.clear();
    }



    public void agregarProducto2(Producto producto){ //ACA ESTOY INTENTANDO HACER EL PUNTO 2 BIEN
        

    }


    public void agregarProducto(Producto producto){ //NO PUDE RESOLVER RAPIDO LA VALIDACION, AVANZO A OTRO PUNTO, SI LLEGO CON EL TIEMPO LO TERMINO
        productos.add(producto);
    }

    public void agregarDescuento(Cupon cupon){
        cupones.add(cupon);
    }


    public int calcularTotalProducto(){
        return productos.stream().mapToInt(Producto::getPrecioUnitario).sum();
    }



    public Producto obtenerProductoMasCaro() { //PUNTO 5
        if (!productos.isEmpty()) {
            Producto productoMasCaro = productos.get(0);
            for (Producto producto : productos) {
                if (producto.getPrecioUnitario() > productoMasCaro.getPrecioUnitario()) {
                    productoMasCaro = producto;
                }
            }return productoMasCaro;
        }
        return null;
    }

    public boolean esAptoParaEnvios(){ // PUNTO 6
        if(!productos.isEmpty()){
            return productos.stream().allMatch(producto -> producto.puedeSerEnviado());
        }return false;
    }
}
