public class Empleado {
    String nombre;
    private Movilidad miMovimilidad;

    public Empleado(String nombre){
        this.nombre = nombre;
    }


    public Regalo cualEsMiPremio(){
        return miMovimilidad.getPremioMerecido();
    }

}
