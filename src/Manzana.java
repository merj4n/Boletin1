import java.util.Comparator;
import java.util.Objects;

public class Manzana implements Comparable {

    private int sabor;

    public Manzana() {
        sabor = 4;
    }

    public Manzana(int sabor) {
        try {
            if (sabor < 0 || sabor > 10) {
                throw new IllegalArgumentException();
            } else {
                this.sabor = sabor;
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "manzana" + sabor;
    }

    public int getSabor() {
        return sabor;
    }

    @Override
    public int compareTo(Object o) {
        return this.getSabor() - ((Manzana) o).getSabor();
    }
}
