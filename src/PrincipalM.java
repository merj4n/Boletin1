import java.util.*;

public class PrincipalM {

    public static void main(String[] args) {

        List<Manzana> cesta = new ArrayList<>();
        List<Manzana> cestacopiada = new ArrayList<>();

        Manzana podrida = new Manzana(4);
        cesta.add(new Manzana(5));
        cesta.add(new Manzana(1));
        cesta.add(new Manzana(8));
        cesta.add(new Manzana(3));
        cesta.add(new Manzana());
        cesta.add(podrida);
        cesta.remove((Integer)0);
        //Collections.sort(cesta);


        for (Manzana nombre: cesta) {
            System.out.println(nombre);
            cestacopiada.add(nombre);
        }
        System.out.println(cestacopiada);
    }



}
