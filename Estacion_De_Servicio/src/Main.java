public class Main {
    public static void main(String[] args) {
        Estacion miEstacion = new Estacion();
        Kiosco kioscoDeLaEstacion = new Kiosco();
        kioscoDeLaEstacion.establecerModem(new Modem());
        miEstacion.agregarKiosco(kioscoDeLaEstacion);

        String clave = miEstacion.cualEsMiKiosco().decimeLaClaveDelWifi();

        System.out.println(clave);
        //String clave = kioscoDeLaEstacion.decimeLaClaveDelWifi();
    }
}