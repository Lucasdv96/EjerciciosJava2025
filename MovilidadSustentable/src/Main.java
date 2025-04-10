public class Main {
    public static void main(String[] args) {
        Empleado martin = new Empleado();

        Regalo voucherCombustible = new Regalo();
        voucherCombustible.setDescripcion("Represento un voucher de combustible");

        Movilidad moverseEnAuto = new Movilidad();
        moverseEnAuto.setPremioMerecido(voucherCombustible);

       martin.tuMedioDeMovilidadEs(moverseEnAuto);
        Movilidad medioDeMartin = martin.cualEsTuMedioDeMovilidad();
        System.out.println();

    }
}