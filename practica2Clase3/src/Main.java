public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancariaPesos = new CuentaBancaria();
        //cuentaBancariaPesos.setUser("LucasDV");
        String user = cuentaBancariaPesos.getUser();
        System.out.println("Mi usuario es: " + user + cuentaBancariaPesos.cuantoDineroTengo());

        cuentaBancariaPesos.depositar(1000);
        int dineroTotal = cuentaBancariaPesos.cuantoDineroTengo();
        System.out.println("tengo: " + dineroTotal + "$ En mi cuenta bancaria");

        cuentaBancariaPesos.retirar(500);
        dineroTotal = cuentaBancariaPesos.cuantoDineroTengo();
        System.out.println("tengo: " + dineroTotal + "$ En mi cuenta bancaria");

        if(cuentaBancariaPesos.estaActivada()){
            System.out.println("La cuenta esta activa");
        }else{
            System.out.println("La cuenta no esta activa");
        }
        cuentaBancariaPesos.retirar(1000);

        CuentaBancaria cuentaBancariaDolares = new CuentaBancaria();
        cuentaBancariaDolares.setUser("LucasDV");
        String userD = cuentaBancariaDolares.getUser();
        cuentaBancariaDolares.depositar(10000000);
        int dineroDolares = cuentaBancariaDolares.cuantoDineroTengo();
        System.out.println("tengo: "+dineroDolares + " dolares");
    }
}
