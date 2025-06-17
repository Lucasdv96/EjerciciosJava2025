public class Main {
    public static void main(String[] args) {
        //GENERADORES

        GeneradorEolico generadorEolico = new GeneradorEolico(13, 0);
        ParqueEolico parqueEolico = new ParqueEolico();

        ReactorNuclear reactorNuclear1 = new ReactorNuclear(150,41);
        ReactorNuclear reactorNuclear2 = new ReactorNuclear(92, 41);
        ReactorNuclear reactorNuclear3 = new ReactorNuclear(100, 41);
        ReactorNuclear reactorNuclear4 = new ReactorNuclear(70, 41);
        ReactorNuclear reactorNuclear = new ReactorNuclear(150, 41);
        CentralNuclear centralNuclear = new CentralNuclear();

        //CIUDADES
        Ciudad pinamar = new Ciudad();


        //Propietarios
        Propietario propietario1 = new Propietario(11111111, "Lucas");
        Propietario propietario2 = new Propietario(22222222, "Ramiro");
        Propietario propietario3 = new Propietario(33333333, "Mateo");

        //CONSUMIDORES
        Consumidor uade = new Consumidor("UADE", 32);
        Consumidor hospital = new Consumidor("Hospital", 50);
        Consumidor distribuidora = new Consumidor("Distribuidora", 68);

        parqueEolico.agregarGeneradoresEolicos(generadorEolico);
        parqueEolico.agregarGeneradoresEolicos(generadorEolico);
        System.out.println(parqueEolico.calcularCantidadEnergiaAportada());
        parqueEolico.quitarGeneradorEolicto(generadorEolico);
        System.out.println(parqueEolico.calcularCantidadEnergiaAportada());

        centralNuclear.setLimite(5);
        centralNuclear.agregarReactor(reactorNuclear1);
        centralNuclear.agregarReactor(reactorNuclear2);
        centralNuclear.setNivelContaminacion(70);

        System.out.println(centralNuclear.cantidadDeEnergiaAportada());


        pinamar.agregarConsumidores(uade);
        pinamar.agregarConsumidores(hospital);
        pinamar.agregarConsumidores(distribuidora);
        System.out.println(pinamar.consumoTotalDeLaciudad());
        System.out.println(centralNuclear.esContaminante());

        pinamar.agregarCentralNuclear(centralNuclear);
        pinamar.setEficienciaEnergetica(82);
        System.out.println(pinamar.esEficiente());

        //PUNTO D
        pinamar.agregarPropietarios(propietario1);
        pinamar.agregarPropietarios(propietario2);
        pinamar.agregarPropietarios(propietario3);
    }
}