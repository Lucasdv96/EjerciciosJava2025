public class ImpresoraBlancoYNegro {
    private int cian;
    private int magenta;
    private int amarillo;
    private int negro;



    private int cantHojas = 100;
    private int cantPaginasImpresas;
    private int cantDocumentosImpresos;

    private boolean fueImpreso;


    public void recargarTodo(){
        this.negro = 1000;
        this.cantHojas = 100;
    }

    public boolean podesImprimir(Documento documento){
        return (this.negro >= documento.getCantTotalDeTinta() &&
                this.cantHojas >= documento.getCantPaginas());
    }

    protected void descontarTintas(Documento unDocumento){
        this.negro -= unDocumento.getCantTotalDeTinta();
    }

    protected void descontarHojas(Documento unDocumento){
        this.cantHojas -= unDocumento.getCantPaginas();
    }
    protected void actualizarContadores(Documento unDocumento){
        this.cantPaginasImpresas += unDocumento.getCantPaginas();
        this.cantDocumentosImpresos ++;
    }

    public Documento imprimi(Documento unDocumento){
        this.descontarTintas(unDocumento);
        this.descontarHojas(unDocumento);
        this.actualizarContadores(unDocumento);
        unDocumento.fuisteImpreso();
        return unDocumento;
    }

    public int getNegro() {

        
    }
}
