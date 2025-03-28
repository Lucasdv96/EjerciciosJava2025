public class Cafetera {
    public String marca;
    public String color;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void elColorEs(){
        System.out.println("El color de mi cafetera es: "+color);
    }

    public void laMarcaEs(){
        System.out.println("La maraca de mi cafetera es: "+marca);
    }
}
