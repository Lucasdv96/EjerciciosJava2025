import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Viajero lucas = new Viajero("Lucas",28);
        Viajero mateo = new Viajero("Mateo",21);
        Viajero rama = new Viajero("Rama",26);

        Paquete paquete1 = new Paquete();

        Grupo grupo1 = new Grupo(paquete1, 2000);

        grupo1.agregarViajero(lucas);
        grupo1.agregarViajero(mateo);
        grupo1.agregarViajero(rama);


    }
}