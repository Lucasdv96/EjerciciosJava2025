package DELVALLE_1140171.src;

public class CuponDescuentoPorCategoria extends Cupon {
    private Categoria categoria;

    public CuponDescuentoPorCategoria(int numeroDescuento, Categoria categoria1) {
        super(numeroDescuento);
        this.categoria = categoria1;
    }
}
