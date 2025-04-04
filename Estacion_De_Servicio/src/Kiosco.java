public class Kiosco {
    private Modem modem;

    public void establecerModem(Modem unModem){
        this.modem = unModem;
    }

    public String decimeLaClaveDelWifi(){
        return modem.cualEsLaClave();
    }
}
