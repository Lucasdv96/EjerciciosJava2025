import java.util.HashSet;

public class CarreraTrail extends Carrera implements EsSponsoreable{

    private final int desnivel;
    private final int cupoMaximo;

    public CarreraTrail(int distancia, String nombre, int desnivel, int cupoMaximo) {
        super(distancia, nombre);
        this.desnivel = desnivel;
        this.cupoMaximo = cupoMaximo;
    }

    @Override
    protected void inscribirCorredor(Corredor corredor) {
        if(this.corredores.size() < cupoMaximo){
            this.corredores.add(corredor);
        }
    }

    @Override
    protected void sumarPuntos(Corredor corredor) {
        corredor.sumarCantPuntos(sumaDePuntosTrial());
    }

    private int sumaDePuntosTrial(){
        return (desnivel/1000 + 20/getDistancia());
    }

    @Override
    public boolean esSponsoreable() {
        return(desnivel >= 2000 || !cantCorresConMasDe5Puntos().isEmpty());
    }

    private boolean corredoresConMasDe5Puntos(Corredor corredor){
        return corredor.getCantPuntos() >= 5;
    }
    // Se puede hacer un contador en vez de hacer un hash.
    // Hay formas de filtrar en los hash

    private HashSet<Corredor> cantCorresConMasDe5Puntos(){
        HashSet<Corredor> corredoresMas5 = new HashSet<>();
        //corredores.stream().anyMatch(corredor -> {corredoresMas5(corredor)}
        for (Corredor corredor1: corredores){
            if(corredoresConMasDe5Puntos(corredor1)){
                corredoresMas5.add(corredor1);
            }
        }
        return corredoresMas5;
    }
}
