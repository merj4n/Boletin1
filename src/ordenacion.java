
import java.util.List;

public class ordenacion {

    public static void ordena(List<String> lista){

        int r=0;
        for (int i=0; i< lista.size()-1; i++) {
            r=i+1;
            System.out.println(lista.get(i)+"<--->"+lista.get(r));
            if (lista.get(i).compareToIgnoreCase(lista.get(r)) < 0){
                System.out.println("Mayor");

            }

        }

    }

}
