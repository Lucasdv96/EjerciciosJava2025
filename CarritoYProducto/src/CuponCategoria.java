public class CuponCategoria extends Cupon{
    private double descuento;
    private Categoria categoria;

    public CuponCategoria(String nombre, Categoria categoria, double descuento) {
        super(nombre);
        this.descuento = descuento;
        this.categoria = categoria;
    }

    @Override
    public int aplicarCupon(Carrito carrito) {

        return 0;
    }
}
