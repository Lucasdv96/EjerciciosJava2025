public class Impresora {
    private int cian = 1000;
    private int magenta = 1000;
    private int amarillo = 1000;
    int negro = 1000;

    private int cantHojas = 100;
    private int cantPaginasImpresas;
    private int cantDocumentosImpresos;

    private boolean fueImpreso;

    public void recargarTodo(){
        this.cian = 1000;
        this.magenta = 1000;
        this.amarillo = 1000;
        this.negro = 1000;
        this.cantHojas = 100;
    }

    public boolean podesImprimir(Documento documento){
        return (this.cian >= documento.getCian() &&
                this.magenta >= documento.getMagenta() &&
                this.amarillo >= documento.getAmarillo() &&
                this.negro >= documento.getNegro() &&
                this.cantHojas >= documento.getCantPaginas());
    }

    protected void descontarTintas(Documento unDocumento){
        this.amarillo -= unDocumento.getAmarillo();
        this.cian -= unDocumento.getCian();
        this.magenta -= unDocumento.getMagenta();
        this.negro -= unDocumento.getNegro();
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




}
