import java.util.HashSet;

public class Corredor implements EsSponsoreable {
    private int distanciaMaxima;
    private HashSet<Carrera> carreras = new HashSet<>();
    private int cantPuntos;
    private boolean tieneCertificadoMedico;

    public Corredor(int distanciaMaxima, int cantPuntos, boolean tieneCertificadoMedico) {
        this.distanciaMaxima = distanciaMaxima;
        this.cantPuntos = cantPuntos;
        this.tieneCertificadoMedico = tieneCertificadoMedico;
    }

    protected void agregarCarrera(Carrera carrera){
        carreras.add(carrera);
    }

    protected int getCantCarreras(){
        return carreras.size();
    }

    public int getDistanciaMaxima() {
        return distanciaMaxima;
    }
    public int getCantPuntos() {
        return cantPuntos;
    }

    public boolean isTieneCertificadoMedico() {
        return tieneCertificadoMedico;
    }

    public void setDistanciaMaxima(int distanciaMaxima) {
        this.distanciaMaxima = distanciaMaxima;
    }

    public void setTieneCertificadoMedico(boolean tieneCertificadoMedico) {
        this.tieneCertificadoMedico = tieneCertificadoMedico;
    }

    public void setCantPuntos(int cantPuntos) {
        this.cantPuntos = cantPuntos;
    }

    public void sumarCantPuntos(int puntos){
        cantPuntos += puntos;
    }

    @Override
    public boolean esSponsoreable() {
        return carreras.size() > 3;
    }
}
