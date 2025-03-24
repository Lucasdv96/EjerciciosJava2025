public class Main {
    public static void main(String[] args) {

        Cerradura miCerradura = new Cerradura();

        Llave miLlave = new Llave();
        miLlave.tuCerraduraEs(new Cerradura());
        System.out.println(miLlave.cualEsTuCerradura());

        Llave miCopia = new Llave();
        miCopia.tuCerraduraEs(miLlave.cualEsTuCerradura());
        System.out.println(miCopia.cualEsTuCerradura());

        System.out.println(miLlave.cualEsTuCerradura() == miCopia.cualEsTuCerradura());

    }
}