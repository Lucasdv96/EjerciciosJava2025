public class Main {
    public static void main(String[] args) {

        //CIUDADES
        Ciudad pinamar = new Ciudad("Pinamar");

        //GENERADORES

        GeneradorEolico generadorEolico = new GeneradorEolico(13, 0);
        ParqueEolico parqueEolico = new ParqueEolico();

        CentralNuclear centralNuclear = new CentralNuclear();

        ReactorNuclear reactorNuclear1 = new ReactorNuclear(150,41);
        ReactorNuclear reactorNuclear2 = new ReactorNuclear(92, 41);
        ReactorNuclear reactorNuclear3 = new ReactorNuclear(100, 41);
        ReactorNuclear reactorNuclear4 = new ReactorNuclear(70, 41);
        ReactorNuclear reactorNuclear5 = new ReactorNuclear(150, 41);


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
        parqueEolico.agregarGeneradoresEolicos(generadorEolico);
        parqueEolico.agregarGeneradoresEolicos(generadorEolico);
        parqueEolico.agregarGeneradoresEolicos(generadorEolico);
        parqueEolico.agregarGeneradoresEolicos(generadorEolico);
        parqueEolico.agregarGeneradoresEolicos(generadorEolico);
        parqueEolico.agregarGeneradoresEolicos(generadorEolico);

        System.out.println("Cantidad de energia aportada del parque eolico es:" + parqueEolico.calcularCantidadEnergiaAportada());
        parqueEolico.quitarGeneradorEolicto(generadorEolico);
        System.out.println("Cantidad de energia aportada" + parqueEolico.calcularCantidadEnergiaAportada());

        centralNuclear.setLimite(5);

        centralNuclear.agregarReactor(reactorNuclear1);
        centralNuclear.agregarReactor(reactorNuclear2);
        centralNuclear.agregarReactor(reactorNuclear3);
        centralNuclear.agregarReactor(reactorNuclear4);
        centralNuclear.agregarReactor(reactorNuclear5);


        System.out.println("Cantidad de energia aportada"+centralNuclear.cantidadDeEnergiaAportada());


        pinamar.agregarConsumidores(uade);
        pinamar.agregarConsumidores(hospital);
        pinamar.agregarConsumidores(distribuidora);
        System.out.println("Consumo de la ciudad: " + pinamar.consumoTotalDeLaciudad());
        System.out.println("La central es contamintante: "+centralNuclear.esContaminante());

        pinamar.agregarCentralNuclear(centralNuclear);
        pinamar.agregarPartquesEolicos(parqueEolico);

        System.out.println(pinamar.centralesContimanantes());

        System.out.println("La ciudad de Pinamar es eficiente?: " + pinamar.ciudadNoEsEficiente());

        //PUNTO D
        pinamar.agregarPropietarios(propietario1);
        pinamar.agregarPropietarios(propietario2);
        pinamar.agregarPropietarios(propietario3);

        propietario1.agregarCentrales(centralNuclear);
        propietario1.agregarCentrales(parqueEolico);

        propietario2.agregarCentrales(centralNuclear);

        propietario3.agregarCentrales(parqueEolico);

        System.out.println("Propietarios de la ciudad" + pinamar.propietariosDeLaCiudad());

        // PUNTO E
        System.out.println(pinamar.produccionTotalDeEnergia());
        System.out.println(parqueEolico.calcularCantidadEnergiaAportada());
        System.out.println(centralNuclear.cantidadDeEnergiaAportada());

        System.out.println("La ciudad de "+ pinamar + " es sustentable? " +  pinamar.laCiudadEsSustentable());

        //PUNTO F
        pinamar.agregarCentralesEnergeticas(parqueEolico);
        pinamar.agregarCentralesEnergeticas(centralNuclear);

        centralNuclear.setPotenciaMaxima(800);
        parqueEolico.setPotenciaMaxima(200);

        System.out.println(centralNuclear.centralExcigida());

        System.out.println("Pinamar es una ciudad potencialmente peligrosa? " + pinamar.centralExigida());
        System.out.println(centralNuclear.cantidadDeEnergiaAportada());
        System.out.println(parqueEolico.calcularCantidadEnergiaAportada());

    }
}