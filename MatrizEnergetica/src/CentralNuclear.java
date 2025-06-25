import java.util.HashSet;

public class CentralNuclear extends CentralEnergetica{
    protected int limiteCantidadReactores;
    protected int nivelContaminacion;

    protected HashSet<ReactorNuclear> reactorNuclears = new HashSet<>();

    public void setLimite(int limite) {
        this.limiteCantidadReactores = limite;
    }

    public void setNivelContaminacion(int nivelContaminacion) {
        this.nivelContaminacion = nivelContaminacion;
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
        return cantDeEmision() >= nivelContaminacion ;
    }





}
