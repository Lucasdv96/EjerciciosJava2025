public class Ascensor {
    private String material;
    private int aguantePeso;

    public int getAguantePeso() {
        return aguantePeso;
    }

    public void setAguantePeso(int aguantePeso) {
        this.aguantePeso = aguantePeso;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
    public void queMaterialEs(){
        System.out.println("mi material es: "+material);
    }

    public int pesoActual(){
        return aguantePeso;
    }
}
