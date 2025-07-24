public class Categoria {
    private String nombre;
    private boolean puedeSerEnviado;

    public Categoria(boolean puedeSerEnviado) {
        this.puedeSerEnviado = puedeSerEnviado;
    }

    public boolean isPuedeSerEnviado() {
        return puedeSerEnviado;
    }

}
