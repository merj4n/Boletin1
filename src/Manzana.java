import javax.swing.*;
import java.util.*;

public class Manzana{

    private int sabor;

    public Manzana(int sabor) {
        if (sabor<0 || sabor>10){
            throw new IllegalArgumentException("Rango de sabor erróneo");
        }
        this.sabor = sabor;
    }

    public Manzana() {
        this.sabor=5;
    }

    public int getSabor() {
        return sabor;
    }

    @Override
    public String toString() {
        return "La manzana tiene de sabor: "+this.sabor;
    }


}
