import java.util.HashSet;

public class Ciudad {
    protected HashSet<Consumidor> consumidores = new HashSet<>();


    public void agregarConsumidores(Consumidor c){
        consumidores.add(c);
    }

    public int consumoTotalDeLaciudad(){
        return consumidores.stream().mapToInt(Consumidor::getConsumoEnergia).sum();
    }


}
