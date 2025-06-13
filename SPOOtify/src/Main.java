public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        Usuario usuario1 = new Usuario(1, "Melina");
        Usuario usuario2 = new Usuario(2, "Juan");


        Cancion cancion1 = new Cancion("Lali", "Fanatico", "RT1");
        Cancion cancion2 = new Cancion("sapo pepe", "El sapo pepe", "RT2");

        cancion1.reproducirCanciones(usuario1);
        cancion1.reproducirCanciones(usuario2);
        cancion1.reproducirCanciones(usuario1);

        cancion2.reproducirCanciones(usuario1);
        cancion2.reproducirCanciones(usuario1);
        //cancion2.reproducirCanciones(usuario1);
        // cancion2.reproducirCanciones(usuario1);


        System.out.println(cancion1.getCantReproducciones());
        System.out.println(cancion1.getUsuariosOyentes());

        plataforma.agregarCancion(cancion1);
        plataforma.agregarCancion(cancion2);
        System.out.println(plataforma.cancionMasReproducida());
        System.out.println(plataforma.BuscarCancionPorId("RT1"));

        System.out.println(plataforma.getArtistas());
    }
}