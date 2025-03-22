public class Llave {
    private Cerradura cerradura;

    public void tuCerraduraEs(Cerradura unaCerradura){
        this.cerradura = unaCerradura;
    }

    public Cerradura cualEsTuCerradura() {
        return cerradura;
    }
}
