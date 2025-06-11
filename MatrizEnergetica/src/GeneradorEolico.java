public class GeneradorEolico extends ParqueEolico{
    protected int cantEnergia;
    protected int nivelEmision;

    public GeneradorEolico(int cantEnergia, int nivelEmision) {
        this.cantEnergia = cantEnergia;
        this.nivelEmision = nivelEmision;
    }

    public int getCantEnergia() {
        return cantEnergia;
    }

    public int getNivelEmision() {
        return nivelEmision;
    }
}
