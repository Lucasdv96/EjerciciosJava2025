public class Main {
    public static void main(String[] args) {
        Impresora epson1 = new Impresora();
        Documento micv = new Documento();

        Documento elCvDeMartin = micv;
        System.out.println(epson1.podesImprimir(elCvDeMartin));

        elCvDeMartin.setCantPaginas(10);

        epson1.imprimi(elCvDeMartin);

        System.out.println(epson1.imprimi(elCvDeMartin));
    }
}