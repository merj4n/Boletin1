import java.util.ArrayList;
import java.util.List;

public class PrincipalOrdenacion {

    public static void main(String[] args) {

        List<String> listado = new ArrayList<>();
        List<String> listado2 = new ArrayList<>();

        listado.add("M");
        listado.add("L");
        listado.add("A");
        listado.add("S");

        listado2.add("A");
        listado2.add("B");
        listado2.add("C");
        listado2.add("D");

        System.out.println(listado);
        System.out.println(listado2);
        //ordenacion.ordena(listado);
        System.out.println(unirListas.ordena(listado, listado2));
    }
}
