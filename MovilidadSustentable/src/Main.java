public class Main {
    public static void main(String[] args) {
        //EMPLEADOS
        Empleado martin = new Empleado();
        Empleado lucas = new Empleado();
        Empleado mateo = new Empleado();
        Empleado ramiro = new Empleado();
        Empleado jose = new Empleado();

        //PREMIOS
        Premio voucherCombustible = new Premio();
        Premio voucherSUBE = new Premio();
        Premio kitDeSeguridad = new Premio();

        //DESCRIPCION PREMIOS
        voucherCombustible.setDescripcion("Voucher de combustible por $50.000");
        voucherSUBE.setDescripcion("Voucher de SUBE por $80.000");
        kitDeSeguridad.setDescripcion("Kit de seguridad");

        //MOVILIDAD
        Movilidad moverseEnAuto = new Movilidad();
        Movilidad moverEnMoto = new Movilidad();
        Movilidad moverseEnTren = new Movilidad();
        Movilidad moverseEnColectivo = new Movilidad();
        Movilidad moverseEnBici = new Movilidad();

        //SET DE VOUCHERS
        moverseEnAuto.setPremioMerecido(voucherCombustible);
        moverEnMoto.setPremioMerecido(voucherCombustible);
        moverseEnTren.setPremioMerecido(voucherSUBE);
        moverseEnColectivo.setPremioMerecido(voucherSUBE);
        moverseEnBici.setPremioMerecido(kitDeSeguridad);

        //SETEO DE MOVILIDAD
        martin.tuMedioDeMovilidadEs(moverseEnAuto);
        lucas.tuMedioDeMovilidadEs(moverEnMoto);
        mateo.tuMedioDeMovilidadEs(moverseEnTren);
        ramiro.tuMedioDeMovilidadEs(moverseEnColectivo);
        jose.tuMedioDeMovilidadEs(moverseEnBici);

        //QUE PREMIOS TIENE CADA EMPLEADO
        String premioMartin = martin.cualEsMiPremio().getDescripcion();
        String premioLucas = lucas.cualEsMiPremio().getDescripcion();
        String premioMateo = mateo.cualEsMiPremio().getDescripcion();
        String premioRamiro = ramiro.cualEsMiPremio().getDescripcion();
        String premioJose = jose.cualEsMiPremio().getDescripcion();

        //TESTEO
        ramiro.tuMedioDeMovilidadEs(moverseEnBici);

        //TESTEO
        System.out.println("El premio de martin es: "+premioMartin);
        System.out.println("El premio de Ramiro es: " + ramiro.cualEsMiPremio().getDescripcion());
        System.out.println("El premio de Mateo es: " +  premioMateo);
        System.out.println("El premio de Jose es: " +  premioJose);
        System.out.println("El premio de lucas es: " +  premioLucas);

        //EJERCICIO 3
        Premio noMasPremio = new Premio();
        noMasPremio.setDescripcion("No hay premio");
        moverseEnAuto.setPremioMerecido(noMasPremio);
        System.out.println("El premio de martin es: "+ martin.cualEsMiPremio().getDescripcion());
        System.out.println("El premio de lucas es: "+ lucas.cualEsMiPremio().getDescripcion());

        Movilidad monopatinElectrico = new Movilidad();
        Premio entradaEvento = new Premio();
        entradaEvento.setDescripcion("Voucher para evento de cualquier indole");
        monopatinElectrico.setPremioMerecido(entradaEvento);
        martin.tuMedioDeMovilidadEs(monopatinElectrico);
        System.out.println("El nuevo premio de martin es: "+ martin.cualEsMiPremio().getDescripcion() );
    }
}