public class CuentaBancaria {
    private String user;
    private int saldo;
    private boolean cuentaActiva;

    public void setUser(String user) {
        this.user = user;
        cuentaActiva = true;
    }

    public String getUser() {
        return user;
    }

    public void depositar(int dinero){
        saldo = saldo + dinero;
    }

    public void retirar(int dineroRetira){
        if(saldo < dineroRetira){
            System.out.println("No se puede completar la operacion por falta de dinero en cuenta");
        }else {
            saldo = saldo - dineroRetira;
        }
    }
    public boolean estaActivada(){
        return cuentaActiva;
    }
    public int cuantoDineroTengo(){
        return saldo;
    }

    public void desactivarCuenta(){
        cuentaActiva = false;
    }

    public void activarCuenta(){
        cuentaActiva = true;
    }

}
