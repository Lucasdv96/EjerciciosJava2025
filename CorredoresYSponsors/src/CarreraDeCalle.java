public class CarreraDeCalle extends Carrera implements EsSponsoreable{

    public CarreraDeCalle(int distancia, String nombre) {
        super(distancia, nombre);
    }

    protected void inscribirCorredorDeCalle(Corredor corredor) {
        if(getDistancia() >= 10 && corredor.isTieneCertificadoMedico()){
            corredores.add(corredor);
            sumarPuntos(corredor);
        } else if (getDistancia() < 10) {
            inscribirCorredor(corredor);
        }
    }

    @Override
    protected void sumarPuntos(Corredor corredor){
        if(corredor.getCantPuntos() < 10){
            corredor.sumarCantPuntos(1);
        }else{
            corredor.sumarCantPuntos(0);
        }
    }

    @Override
    public boolean esSponsoreable() {
        return corredores.size() >= 100;
    }
}
