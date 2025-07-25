//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carrito chango = new Carrito();

        chango.setNombre("Mateo");

        Categoria mates = new Categoria("mate", true);

        Producto mate = new Producto("mate",30, mates,"alto mate ");

        Producto bombillar = new ProductoCondicionado("bombilla", 15, mates, "dasd", 3);

        Producto yerba = new ProductoAsociado("yerba",50, mates, "dasda", mate);


        Cupon matesBaratos = new CuponProducto("matesBaratos", mate, 10);
        Cupon matesCategoria = new CuponCategoria("matesfree", mates, 0.15);

        chango.agregarCupon(matesCategoria);
        chango.agregarCupon(matesBaratos);

        //chango.agregarProducto(bombillar);
        chango.agregarProducto(mate);
        chango.agregarProducto(yerba);

        //chango.agregarProducto(yerba);




       // System.out.println(chango.getProductos());

        System.out.println(chango.total());





    }
}