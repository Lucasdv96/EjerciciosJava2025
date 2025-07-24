package DELVALLE_1140171.src;

public class CuponImporteFijo extends Cupon{
    private Producto producto;

    public CuponImporteFijo(int numeroDescuento, Producto producto) {
        super(numeroDescuento);
        this.producto = producto;
    }


}
