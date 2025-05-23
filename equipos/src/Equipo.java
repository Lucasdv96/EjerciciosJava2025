import java.util.HashSet;

public class Equipo{

    private HashSet<Jugador> jugadores = new HashSet<Jugador>();
    private boolean existe;

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);

    }

    public boolean jugadorExiste(Jugador e){
        for(Jugador jugador: jugadores){
            if(jugador == e){
                return true;
            }
        }return false;
    }

    public HashSet<Jugador> quienesSonTusJugadores() {
        return jugadores;
    }


    public int cuantosIntegrantes() {
        return jugadores.size();
    }
}
