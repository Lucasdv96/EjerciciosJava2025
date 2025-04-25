public class ImpresoraBlancoYNegro extends Impresora{

    @Override
    public boolean podesImprimir(Documento documento) {
        return (
                this.getNegro() >= documento.getCantTotalDeTinta() && this.getCantHojas() >= documento.getCantPaginas()
                );
    }

    @Override
    protected void descontarHojas(Documento unDocumento) {
        this.negro -= unDocumento.getCantTotalDeTinta();
    }


    //  NO HACE FALTA TENER EL IMPRIMIR PORQUE AUNQUE ACA SE MODIFIQUEN IGUAL VA A DARLE PRIORIDAD AL DE ESTA CLASE
//    @Override
//    public Documento imprimi(Documento unDocumento) {
//        this.descontarTintas(unDocumento);
//        this.descontarHojas(unDocumento);
//        this.actualizarContadores(unDocumento);
//        unDocumento.fuisteImpreso();
//        return unDocumento;
//    }
}
