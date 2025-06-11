public class Main {
    public static void main(String[] args) {
        GeneradorEolico generadorEolico = new GeneradorEolico(13, 0);
        ParqueEolico parqueEolico = new ParqueEolico();


        parqueEolico.agregarGeneradoresEolicos(generadorEolico);
        parqueEolico.agregarGeneradoresEolicos(generadorEolico);
        System.out.println(parqueEolico.calcularCantidadEnergiaAportada());
    }
}