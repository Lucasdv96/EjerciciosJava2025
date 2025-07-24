import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente("Lucas");
        Carrito carrito1 = new Carrito(lucas);

        Categoria celular = new Categoria(true);
        Categoria television = new Categoria(true);
        Categoria construccion = new Categoria(false);


        System.out.println("El nombre del cliente es:" + carrito1.conocerNombreCliente());

        Producto iphone = new Producto("Iphone 16",2100000,celular,"Iphone 16" );
        iphone.setLimite(2);

        Producto smartTV = new Producto("Televisor Smart",350000, television,"un smart");
        Producto soporteSmart = new Producto("Soporte Televisor smart",10000, television, "Es un soporte de tele");
        smartTV.setProductoAsociado(soporteSmart);

        Producto iphone25 = new Producto("Iphone25", 10000000, celular,"El ultimo iphone" );

        Producto paletLadrillos = new Producto("Palet de ladrillos", 250000, construccion," es un palet de ladrillos");

        //PUNTO 1
        carrito1.agregarProducto(iphone);
        carrito1.agregarProducto(iphone);
        carrito1.agregarProducto(iphone);
        carrito1.agregarProducto(smartTV);
        carrito1.agregarProducto(iphone25);

        System.out.println(carrito1.getProductos());
        System.out.println(carrito1.getCupones());

        System.out.println("El carrito puede ser enviado: "+ carrito1.esAptoParaEnvios()); //PRIMERO PREGUNTAMOS SI PUEDE SER ENVIADO
        carrito1.agregarProducto(paletLadrillos);
        System.out.println("El carrito puede ser enviado: "+ carrito1.esAptoParaEnvios()); //AL AGREGAR EL PALET DE LADRILLOS QUE NO PUEDE SER ENVIADO PREGUNTAMOS DE NUEVO

        System.out.println("El prodcto mas caro del carrito es: " + carrito1.obtenerProductoMasCaro());

        carrito1.vaciarCarrito();
        System.out.println(carrito1.getProductos());
        System.out.println(carrito1.getCupones());

    }
}