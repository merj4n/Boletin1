import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class unirListas {

    public static List ordena(List<String> lista, List<String> lista2){

        for (int i=0; i<lista2.size();i++){
            lista.add(lista2.get(i));
        }
        Collections.sort(lista);
        return lista;
    }
}
