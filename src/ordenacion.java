
import java.util.List;

public class ordenacion {

    public static void ordena(List<String> lista){

        boolean ordenada = true;
        int r;
        for (int i=0; i< lista.size()-1; i++) {
            r=i+1;
            System.out.println(lista.get(i)+"<--->"+lista.get(r));
            if (lista.get(i).compareToIgnoreCase(lista.get(r)) > 0){
                ordenada = false;
            }
        }
        System.out.println("La lista esta ordenada? "+ ordenada);
    }
}
