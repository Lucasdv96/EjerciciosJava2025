public class Producto {
    private String nombreProducto;
    private int precioUnitario;
    private Producto productoAsociado;
    private Categoria categoria;
    private String descripcion;
    private int limite;

    public Producto(String nombreProducto, int precioUnitario, Categoria categoria, String descripcion) {
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombreProducto;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }


    protected boolean tieneProductoAsociado(){
        if(productoAsociado != null){
            return true;
        }
        return false;
    }

    public void setProductoAsociado(Producto productoAsociado) {
        this.productoAsociado = productoAsociado;
    }

    public Producto getProductoAsociado() {
        return productoAsociado;
    }

    public boolean puedeSerComprado(){
        if(productoAsociado == null){
            return true;
        }return false;
    }

    public boolean puedeSerEnviado(){
        return categoria.isPuedeSerEnviado();
    }
}
