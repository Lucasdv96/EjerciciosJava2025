public class Main {
    public static void main(String[] args) {
        PapaNoel papaNoel = new PapaNoel();

        Domicilio domicilio1 = new Domicilio();
        Domicilio domicilio2 = new Domicilio();

        papaNoel.agregarDomicilioPendiente(domicilio1);
        papaNoel.agregarDomicilioPendiente(domicilio2);

        System.out.println(papaNoel.getDomiciliosPendientes());

        papaNoel.agregarDomicilioPendiente(domicilio1);
    }
}