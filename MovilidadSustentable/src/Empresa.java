import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Empleado> empleados;
    Empleado empleado;
    int voucherAutoMoto;
    int voucherSube;
    String kitSeguridad = "Chaleco Fluorecente y Casco";

    public Empresa(){
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }



}
