public class Peras {
    private int sabor;

    public Peras(int sabor) {
        if (sabor<0 || sabor>10){
            throw new IllegalArgumentException("Rango de sabor erróneo");
        }
        this.sabor = sabor;
    }

    public Peras() {
        this.sabor=5;
    }

    public int getSabor() {
        return sabor;
    }

    @Override
    public String toString() {
        return "La pera tiene de sabor: "+this.sabor;
    }
}
