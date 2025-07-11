public class Casa extends Domicilio{
    private boolean tieneChimenea;

    public Casa(boolean tieneChimenea) {
        this.tieneChimenea = tieneChimenea;
    }

    @Override
    public boolean esVisitable() {
        return tieneChimenea;
    }
}
