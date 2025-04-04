public class Estacion {
    private String marca;
    private Kiosco miKiosco;

    public void agregarKiosco(Kiosco kiosco){
        this.miKiosco = kiosco;
    }

    public Kiosco cualEsMiKiosco(){
        return miKiosco;
    }

    public String decimeLaClaveDelWifi(){
        return miKiosco.decimeLaClaveDelWifi();
    }
}
