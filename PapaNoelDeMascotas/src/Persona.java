public class Persona extends Habitante{

    @Override
    public boolean puedeRecibirRegalo() {
        return getEdad() < 12;
    }

}
