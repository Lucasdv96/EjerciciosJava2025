public class Pan {
    private String tipoDePan;
    private int precio;

    public Pan(String tipoDePan, int precio){
        this.tipoDePan = tipoDePan;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
