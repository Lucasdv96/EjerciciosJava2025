public class Main {
    public static void main(String[] args) {
        //GENERADORES

        GeneradorEolico generadorEolico = new GeneradorEolico(13, 0);
        ParqueEolico parqueEolico = new ParqueEolico();

        ReactorNuclear reactorNuclear1 = new ReactorNuclear(30,41);
        ReactorNuclear reactorNuclear2 = new ReactorNuclear(50, 41);
        ReactorNuclear reactorNuclear3 = new ReactorNuclear(100, 41);
        ReactorNuclear reactorNuclear4 = new ReactorNuclear(70, 41);
        ReactorNuclear reactorNuclear = new ReactorNuclear(150, 41);
        CentralNuclear centralNuclear = new CentralNuclear();

        //CONSUMIDORES
        Consumidor Uade = new Consumidor("UADE", 32);
        Consumidor Hospital = new Consumidor("Hospital", 50);
        Consumidor Distribuidora = new Consumidor("Distribuidora", 68);



        parqueEolico.agregarGeneradoresEolicos(generadorEolico);
        parqueEolico.agregarGeneradoresEolicos(generadorEolico);
        System.out.println(parqueEolico.calcularCantidadEnergiaAportada());
    }
}