import java.util.HashSet;

public class Ciudad {
    protected String nombre;
    protected HashSet<Consumidor> consumidores = new HashSet<>();
    protected HashSet<CentralNuclear> centralNuclears = new HashSet<>();
    protected HashSet<ParqueEolico> parqueEolicos = new HashSet<>();
    protected HashSet<CentralEnergetica> centralEnergeticas = new HashSet<>();
    protected HashSet<Propietario> propietarios = new HashSet<>();

    protected int eficienciaEnergetica;

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  nombre;

    }

    public void agregarConsumidores(Consumidor c){
        consumidores.add(c);
    }

    public void agregarCentralNuclear(CentralNuclear centralNuclear){
        centralNuclears.add(centralNuclear);
    }

    public void agregarPropietarios(Propietario p){
        propietarios.add(p);
    }

    public void agregarPartquesEolicos(ParqueEolico parqueEolico){
        parqueEolicos.add(parqueEolico);
    }

    public void agregarCentralesEnergeticas(CentralEnergetica centralEnergetica){
        centralEnergeticas.add(centralEnergetica);
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

    //E



    public int produccionTotalDeEnergia(){
        int sumaCentraleNucleares = centralNuclears.stream().mapToInt(CentralNuclear::cantidadDeEnergiaAportada).sum();
        int sumaParqueEloicos = parqueEolicos.stream().mapToInt(ParqueEolico::calcularCantidadEnergiaAportada).sum();
        return  sumaParqueEloicos + sumaCentraleNucleares;
    }

    public boolean laCiudadEsSustentable(){
        return consumoTotalDeLaciudad() < produccionTotalDeEnergia();
    }

    //F

    public boolean centralExigida(){
        if (centralNuclears.stream().anyMatch(CentralNuclear::centralExcigida) || parqueEolicos.stream().anyMatch(ParqueEolico::centralExcigida)) {
            return true;
        }
        return false;
    }
}
