public class ImpresoraPDF extends Impresora{
    @Override
    public boolean podesImprimir(Documento documento) {
        return true;
    }

    @Override
    public Documento imprimi(Documento unDocumento) {
        this.actualizarContadores(unDocumento);
        unDocumento.fuisteImpreso();
        return unDocumento;
    }
}
