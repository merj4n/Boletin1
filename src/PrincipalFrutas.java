import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalFrutas {
    public static void main(String[] args) {
        try {
            List<Manzana> listaManzana=new ArrayList<>();

            Manzana manzana1=new Manzana(7);
            Manzana manzana2=new Manzana(2);
            Manzana manzana3=new Manzana(4);
            Manzana manzana4=new Manzana(9);

            listaManzana.add(manzana1);
            listaManzana.add(manzana2);
            listaManzana.add(manzana3);
            listaManzana.add(manzana4);

            for (Object unidad : listaManzana) { // Selecciona cada manzana(objeto) de la lista de manzanas de tipo "Manzana"
                System.out.println(unidad);
            }

            Collections.sort(listaManzana, new Comparator<Manzana>() {//Empoyar
                @Override
                public int compare(Manzana o1, Manzana o2) {
                    return o1.getSabor()-o2.getSabor();
                }
            });

            System.out.println("--------------------");

            for (Manzana manzana : listaManzana) {
                System.out.println(manzana);
            }

        }catch (IllegalArgumentException il){//Empoyar
            System.out.println(il.getMessage());
        }
    }
}
