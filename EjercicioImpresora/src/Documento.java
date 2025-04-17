public class Documento {
    private int cian;
    private int magenta;
    private int amarillo;
    private int negro;

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
    //SETTERS


    public void setCian(int cian) {
        this.cian = cian;
    }

    public void setMagenta(int magenta) {
        this.magenta = magenta;
    }

    public void setAmarillo(int amarillo) {
        this.amarillo = amarillo;
    }

    public void setNegro(int negro) {
        this.negro = negro;
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
