public class Impresora {
    private String marca;
    private int cantHojas;

    public void setCantHojas(int cantHojas) {
        this.cantHojas = cantHojas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantHojas() {
        return cantHojas;
    }

    public String getMarca() {
        return marca;
    }

    public void cuantasHojasTengo(){
        System.out.println("Tengo: "+cantHojas + " Hojas");
    }


}
