public class Perro {
    private String raza;
    private String nombre = "jose";
    private int edad;
    private int cantpatas = 4;

    public void ladrar(){
        System.out.println("wouf wouf");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cumplioanios(){
        edad++;
    }
}
