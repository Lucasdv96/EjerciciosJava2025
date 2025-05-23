import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Partido {

    private Equipo local;
    private Equipo visitante;

    public Partido(Equipo local, Equipo visitante){
        this.local = local;
        this.visitante = visitante;
    }
    private List<Jugador> amonestaciones = new LinkedList<Jugador>();


    public boolean amonestar(Jugador e) {
        if(local.jugadorExiste(e) || visitante.jugadorExiste(e)) {
            amonestaciones.add(e);
            return true;
        }
        return false;
    }

    public String queJugadoresJuegan() {
        return local.quienesSonTusJugadores().toString() + visitante.quienesSonTusJugadores().toString();
    }

    public int jugadoresAmonestados() {
        return amonestaciones.size();
    }

    public boolean huboFairPlay() {
        return amonestaciones.size() == 0;
    }
}
