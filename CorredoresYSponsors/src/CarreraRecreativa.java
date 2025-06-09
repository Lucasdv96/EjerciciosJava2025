public class CarreraRecreativa extends Carrera implements EsSponsoreable{
    public CarreraRecreativa(int distancia, String nombre) {
        super(distancia, nombre);
    }

    @Override
    public boolean esSponsoreable() {
        return false;
    }
}
