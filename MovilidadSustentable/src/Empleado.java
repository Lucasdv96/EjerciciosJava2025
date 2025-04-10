public class Empleado {
    String nombre;
    private Movilidad miMovimilidad;

    public Empleado(){
        this.nombre = nombre;
    }

    public void tuMedioDeMovilidadEs(Movilidad medio){
        this.miMovimilidad = medio;
    }

    public Movilidad cualEsTuMedioDeMovilidad(){
        return this.miMovimilidad;
    }


    public Premio cualEsMiPremio(){
        return miMovimilidad.getPremioMerecido();
    }

}
