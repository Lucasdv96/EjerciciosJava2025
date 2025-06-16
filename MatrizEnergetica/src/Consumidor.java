public class Consumidor {
    private final String nombreConsumidor;
    private final int consumoEnergia;

    public Consumidor(String nombreConsumidor, int consumoEnergia) {
        this.nombreConsumidor = nombreConsumidor;
        this.consumoEnergia = consumoEnergia;
    }

    public int getConsumoEnergia() {
        return consumoEnergia;
    }


}
