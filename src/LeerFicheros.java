import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LeerFicheros {
    public static void main(String[] args) {
        File fichero1= new File("texto.txt");
        List<String> lineas = new ArrayList<>();
        List<String> lcaracteres = new ArrayList<>();
        List<List<String>> listaDeListas = new ArrayList<>();
        try {
            lineas=Files.readAllLines(fichero1.toPath());
        }catch (IOException ioe){

        }
        //System.out.println(lineas);
        for (String s : lineas){
            //System.out.println(s);
            String caracteres[]=s.split(" ");
            listaDeListas.add(Arrays.asList(caracteres));
        }
        listaDeListas.remove("0");
        System.out.println(listaDeListas);
        Iterator<List<String>> it = listaDeListas.iterator();//Recorre el indice de la lista
        while (it.hasNext()){//devuelve si hay una lista siguiente como boolean
            Iterator<String> it2 = it.next().iterator();
            System.out.println("");
            while (it2.hasNext()){
                String siguiente = it2.next();
                if (!siguiente.equals("0")) System.out.print(siguiente);
            }
        }
    }
}
