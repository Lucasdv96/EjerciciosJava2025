import java.util.HashSet;

public class Ciudad {
    protected HashSet<Consumidor> consumidores = new HashSet<>();
    protected HashSet<CentralNuclear> centralNuclears = new HashSet<>();
    protected HashSet<Propietario> propietarios = new HashSet<>();

    protected int eficienciaEnergetica;

    public void agregarConsumidores(Consumidor c){
        consumidores.add(c);
    }

    public void agregarCentralNuclear(CentralNuclear centralNuclear){
        centralNuclears.add(centralNuclear);
    }

    public void agregarPropietarios(Propietario p){
        propietarios.add(p);
    }

    public void setEficienciaEnergetica(int eficienciaEnergetica) {
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    public int consumoTotalDeLaciudad(){
        return consumidores.stream().mapToInt(Consumidor::getConsumoEnergia).sum();
    }

    public boolean esEficiente(){
        return centralNuclears.stream().mapToInt(CentralNuclear::cantDeEmision).sum() > eficienciaEnergetica;
    }

//    public HashSet propietariosDeLaCiudad(){
//        return propietarios.stream().map()
//    }
}
