public class Medallon {
    public String tipoMedallon;
    public int precio;

    public Medallon(String tipoMedallon, int precio){
        this.tipoMedallon = tipoMedallon;
        this.precio = precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
