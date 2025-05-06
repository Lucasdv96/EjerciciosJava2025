public class Turnero {
    private int ultimoNumero = 0;
    public void reiniciar() {
        this.ultimoNumero = 0;
    }
    public int queNumeroVa() {
        return this.ultimoNumero;
    }
    public Turno dameUnTurno() {
        ultimoNumero ++;
        return new Turno(ultimoNumero);
    }
    public Turno quienEstaPrimero(Turno t1, Turno t2) {
        return t1.queNumeroTiene() < t2.queNumeroTiene()
                ? t1
                : t2;
    }
}
