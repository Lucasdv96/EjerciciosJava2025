public class Empleado {
    String nombre;
    Vehiculo.Vehiculos vehiculo;

    public Empleado(String nombre, Vehiculo.Vehiculos vehiculo){
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    public String getEmpleadoInf(){
        return "Empleado: "+ nombre + ", Vehiculo: " + vehiculo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setVehiculo(Vehiculo.Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vehiculo.Vehiculos getVehiculo() {
        return vehiculo;
    }
}
