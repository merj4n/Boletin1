public class Hijo extends Padre {
    public Hijo(int numero) {
        super(numero);
    }
    @Override
    public int suma() {
        return super.suma() + 1;
    }
    public int resta() {
        return getNumero() - 1;
    }
}
