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

    public HashSet centralesContimanantes(){
        HashSet<CentralNuclear> centralNuclearesContimantes = new HashSet<>();
        for(CentralNuclear centralNuclear: centralNuclears){
            if(centralNuclear.esContaminante()){
                centralNuclearesContimantes.add(centralNuclear);
            }
        }return centralNuclearesContimantes;
    }

    public boolean ciudadNoEsEficiente(){
        return centralNuclears.stream().anyMatch(CentralNuclear::noEsEficiente);
    }






    //public HashSet propietariosDeLaciudad

    public HashSet propietariosDeLaCiudad(){
        HashSet<Propietario> propietariosDueniosDeCentrales = new HashSet<>();
        for(Propietario propietario: propietarios  ){
            propietariosDueniosDeCentrales.add(propietario);
            }
        return propietariosDueniosDeCentrales;
    }

}
