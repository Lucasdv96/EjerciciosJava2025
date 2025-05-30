import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // LISTAS DE MEDALLONES E INGREDIENTES
        ArrayList<Medallon> medallons = new ArrayList<Medallon>();
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

        //CREANDO INSTANCIAS DE PAN
        Pan panDePapa = new Pan("Pan de Papa", 4500);
        Pan panDeCampo = new Pan("Pan de Campo", 5500);

        // CREANDO LAS INSTANCIAS DE LAS HAMBURGUESAS
        Hamburguesa hamburguesaConPanPapa = new Hamburguesa(panDePapa, medallons, ingredientes);
        Hamburguesa hamburguesaConPanDeCampo = new Hamburguesa(panDeCampo,medallons, ingredientes);

        //CREANDO INSTANCIAS DE MEDALLONES
        Medallon medallonCarne = new Medallon("Medallon de carne", 2900);
        Medallon medallonPollo = new Medallon("Medallon de pollo", 1500);
        Medallon medallonVegetariano =new Medallon("Medallon Vegetariano", 1890);

        //CREANDO INSTANCIAS DE INGREDIENTES
        Ingrediente cheddar = new Ingrediente("Cheddar", 600);
        Ingrediente berenjena = new Ingrediente("Berenjena", 350);


        hamburguesaConPanPapa.agregarIngredientes(cheddar);
        hamburguesaConPanPapa.agregarIngredientes(berenjena);
        hamburguesaConPanPapa.agregarMedallon(medallonCarne);
        hamburguesaConPanPapa.agregarMedallon(medallonPollo);

        System.out.println(hamburguesaConPanPapa.calcularPrecio());


        //SEGUNDA HAMBURGUESA

        hamburguesaConPanDeCampo.agregarMedallon(medallonVegetariano);
        hamburguesaConPanDeCampo.agregarIngredientes(cheddar);
        hamburguesaConPanDeCampo.agregarIngredientes(berenjena);
        System.out.println(hamburguesaConPanDeCampo.sePuedeFacturar());
        hamburguesaConPanDeCampo.agregarMedallon(medallonVegetariano);
        System.out.println(hamburguesaConPanDeCampo.sePuedeFacturar());

        int precio;
        try{
            precio = hamburguesaConPanDeCampo.calcularPrecio();
        } catch (FacturacionException e) {
            System.out.println("No podemos calcular el precio, la hamburguesa dice que..."  + e.getMessage());
        }
    }
}