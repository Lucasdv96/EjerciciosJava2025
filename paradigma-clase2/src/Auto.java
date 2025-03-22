public class Auto {
    private String color;
    private int modelo;
    private int velocidadActual;
    private boolean estaEnMarcha;
    private boolean esAutomatico;


    public void acelera(){
        velocidadActual = velocidadActual+1;
    }

    public void tuColorEs(String unColor){
        this.color = unColor;
    }

    public void frena(){

    }
}
