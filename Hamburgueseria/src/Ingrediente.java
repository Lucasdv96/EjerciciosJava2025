public class Ingrediente {
    public String tipoIngrediente;
    public int precio;

    public Ingrediente (String tipoIngrediente, int precio){
        this.tipoIngrediente = tipoIngrediente;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
