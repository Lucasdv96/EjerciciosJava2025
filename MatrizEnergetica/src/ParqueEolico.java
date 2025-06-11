import java.util.ArrayList;

public class ParqueEolico extends CentralEnergetica{
    protected ArrayList<GeneradorEolico> generadoresEolicos = new ArrayList<>();

    public void agregarGeneradoresEolicos(GeneradorEolico generadorEolico){
        generadoresEolicos.add(generadorEolico);
    }

    public void quitarGeneradorEolicto(GeneradorEolico generadorEolico){
        generadoresEolicos.remove(generadorEolico);
    }

    public int calcularCantidadEnergiaAportada(){
        return generadoresEolicos.stream().mapToInt(GeneradorEolico::getCantEnergia).sum();
    }
}
