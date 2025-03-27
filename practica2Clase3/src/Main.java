public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Ascensor ascensor = new Ascensor();
        System.out.println(perro);
        ascensor.setMaterial("hierro");
        System.out.println(ascensor.getMaterial());
    }
}
