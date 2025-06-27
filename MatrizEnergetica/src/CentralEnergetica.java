public abstract class CentralEnergetica {
    protected int exigencia;
    protected int potenciaMaxima;


    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public boolean centralExcigida(int energiaAportada){
        return energiaAportada >= potenciaMaxima;
    }


    public abstract boolean centralExcigida();
}
