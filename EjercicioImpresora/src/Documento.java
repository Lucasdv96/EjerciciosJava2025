public class Documento {
    private int cian = 50;
    private int magenta = 50;
    private int amarillo = 50;
    private int negro = 50;

    private int cantPaginas;
    private boolean fueImpreso;

    //GETTERS
    public int getCian() {
        return cian;
    }

    public int getMagenta() {
        return magenta;
    }

    public int getAmarillo() {
        return amarillo;
    }

    public int getNegro() {
        return negro;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public int getCantTotalDeTinta(){
        return cian + magenta + amarillo + negro;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void fuisteImpreso(){
        this.fueImpreso = true;
    }
}
