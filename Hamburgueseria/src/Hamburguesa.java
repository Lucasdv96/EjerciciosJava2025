import java.util.ArrayList;

public class Hamburguesa {
    private Medallon medallon;
    private Ingrediente ingrediente;
    private final Pan pan;

    public boolean puedeFacturar;

    private ArrayList<Medallon> medallones = new ArrayList<Medallon>();
    private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

    public Hamburguesa(Pan tipoPan, ArrayList<Medallon> medallones, ArrayList<Ingrediente> ingredientes){
        this.pan = tipoPan;
        this.ingredientes = ingredientes;
        this.medallones = medallones;
    }


    public void agregarMedallon(Medallon medallon){
        medallones.add(medallon);
    }

    public void agregarIngredientes (Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public int sacarTotalMedallones(){
        int sumaPrecio = 0;
        for(Medallon medallon1: medallones){
            sumaPrecio += medallon1.getPrecio();
        }
        return sumaPrecio;

    }

    public int sacarTotalIngredientes(){
        int sumaPrecio = 0;
        for(Ingrediente ingrediente1: ingredientes){
            sumaPrecio += ingrediente1.getPrecio();
        }
        return sumaPrecio;
    }



    public int calcularPrecio() throws FacturacionException{
        if(sePuedeFacturar()){
            return this.pan.getPrecio() + this.sacarTotalMedallones() + this.sacarTotalIngredientes();
        }else{
            throw new FacturacionException("No se puede calcular el precio porque...");
        }



    }

    public boolean sePuedeFacturar(){
        return(!this.medallones.isEmpty() && medallones.size() >= ingredientes.size());
    }


}
