public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente("Lucas");
        Carrito carrito1 = new Carrito(lucas);

        Categoria celular = new Categoria(true);
        Categoria television = new Categoria(true);
        Categoria construccion = new Categoria(false);


        System.out.println("El nombre del cliente es:" + carrito1.conocerNombreCliente());

        Producto iphone = new Producto("Iphone 16",2100000,celular,"Iphone 16" );


        Producto smartTV = new Producto("Televisor Smart",350000, television,"un smart");
        Producto soporteSmart = new ProductoAsociado("Soporte Televisor smart",10000, television, "Es un soporte de tele",smartTV);

        Producto iphone25 = new ProductoCondicionado("Iphone25", 10000000, celular,"El ultimo iphone",1 );

        Producto paletLadrillos = new Producto("Palet de ladrillos", 250000, construccion," es un palet de ladrillos");

        //PUNTO 1
        carrito1.agregarProducto(iphone);
        carrito1.agregarProducto(iphone);
        carrito1.agregarProducto(iphone);
        carrito1.agregarProducto(smartTV);
        carrito1.agregarProducto(iphone25);
        carrito1.agregarProducto(iphone25);

        System.out.println(carrito1.getProductos());
    }
}