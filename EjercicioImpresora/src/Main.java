public class Main {
    public static void main(String[] args) {
        Impresora epson1 = new Impresora();
        Documento micv = new Documento();

        epson1.recargarTodo();

        Documento elCvDeMartin = micv;
        System.out.println(epson1.podesImprimir(elCvDeMartin));

        elCvDeMartin.setCantPaginas(6);
        elCvDeMartin.setNegro(5);
        elCvDeMartin.setMagenta(1);
        elCvDeMartin.setCian(2);
        elCvDeMartin.setAmarillo(3);

        System.out.println(epson1.podesImprimir(elCvDeMartin));


        System.out.println(epson1.imprimi(elCvDeMartin));
        System.out.println(epson1.getCantHojas());
    }
}