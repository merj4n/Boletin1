public class Padre {
    private final int numero;
    public Padre(int numero) {
        this.numero = numero;
    }
    public int suma() {
        return numero + 1;
    }
    public int getNumero() {
        return numero;
    }
}
