public class Main {
    public static void main(String[] args) {

        Jugador j1 = new Jugador("Nombre 1");
        Jugador j2 = new Jugador("Nombre 2");
        Jugador j3 = new Jugador("Nombre 3");
        Jugador j4 = new Jugador("Nombre 4");

        Equipo boca = new Equipo();
        Equipo river = new Equipo();

        boca.agregarJugador(j1);
        boca.agregarJugador(j2);

        river.agregarJugador(j3);
        river.agregarJugador(j4);

        System.out.println(boca.quienesSonTusJugadores()); //Preguntarle a un equipo sus integrantes
        System.out.println(boca.cuantosIntegrantes()); //Preguntarle a un equipo la cant de integrantes

        Partido clasico = new Partido(boca, river);


        clasico.amonestar(j3); // pasarle un jugador para amonestar(validarlo)
        System.out.println(clasico.queJugadoresJuegan());
        System.out.println(clasico.jugadoresAmonestados()); //la coleccion de jugadores amonestado

        System.out.println(clasico.huboFairPlay()); //true o false


        //HACER UN METODO QUE SAQUE LA CANTIDAD DE GOLES DE JUGADORES, EQUIPOS Y EL RESULTADO DEL PARTIDO
    }
}