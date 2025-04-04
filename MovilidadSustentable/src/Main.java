public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos", Vehiculo.Vehiculos.AUTO );
        empleado1.setNombre("jose");
        System.out.println(empleado1.getNombre());
        empleado1.setVehiculo(Vehiculo.Vehiculos.BICICLETA);
        System.out.println(empleado1.getVehiculo());
        System.out.println(empleado1.getEmpleadoInf());
    }
}