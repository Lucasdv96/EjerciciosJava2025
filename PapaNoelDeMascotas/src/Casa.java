public class Casa extends Domicilio{
    private boolean tieneChimenea;

    public Casa(boolean visitable, Barrio barrio) {
        super(visitable, barrio);
    }


    @Override
    public boolean esVisitable() {
        return tieneChimenea;
    }
}
