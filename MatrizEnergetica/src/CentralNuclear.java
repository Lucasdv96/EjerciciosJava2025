import java.util.HashSet;

public class CentralNuclear extends CentralEnergetica{
    protected int limiteCantidadReactores;
    protected int contamina = 70;
    protected int eficiencia = 82;

    protected HashSet<ReactorNuclear> reactorNuclears = new HashSet<>();

    public void setLimite(int limite) {
        this.limiteCantidadReactores = limite;
    }

    public void setContamina(int nivelContaminacion) {
        this.contamina = nivelContaminacion;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    public void agregarReactor(ReactorNuclear reactorNuclear){
        reactorNuclears.add(reactorNuclear);
        if(reactorNuclears.size() > limiteCantidadReactores){
            throw new CantidadDeReactoresSuperada("Se ha superado la cantidad de reactores");
        }
    }

    public int cantidadDeEnergiaAportada(){
        return reactorNuclears.stream().mapToInt(ReactorNuclear::getCantEnergia).sum() - 5;

    }

    public int cantDeEmision(){
        return reactorNuclears.stream().mapToInt(ReactorNuclear::getNivelEmision).sum();
    }

    public boolean esContaminante(){
        return cantDeEmision() >= contamina ;
    }

    public boolean noEsEficiente(){
        return cantDeEmision() < eficiencia;
    }

    public HashSet<ReactorNuclear> getReactorNuclears() {
        return reactorNuclears;
    }
}
