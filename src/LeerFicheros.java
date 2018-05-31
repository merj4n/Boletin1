import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LeerFicheros {
    public static void main(String[] args) {
        File fichero1= new File("texto.txt"); //Forma simple de lectura de fichero
        List<String> lineas = new ArrayList<>(); //Defino una lista de Strings, para almacenar liena a linea del fichero
        List<List<String>> listaDeListas = new ArrayList<>(); //Lista de listas de lineas
        List<List<String>> listaDeListasCorrecta = new ArrayList<>(); //Lista de listas de lineas
        try {
            lineas=Files.readAllLines(fichero1.toPath()); //Leo todas las linas del fichero
        }catch (IOException ioe){
        }
        for (String s : lineas){
            String caracteres[]=s.split(" ");
            listaDeListas.add(Arrays.asList(caracteres));
        }
        listaDeListas.remove("0");
        Iterator<List<String>> it = listaDeListas.iterator();//Recorre el indice de la lista
        while (it.hasNext()){//devuelve si hay una lista siguiente como boolean
            List<String> correcta = new ArrayList<>();
            for (String i : it.next()) {
                if (!i.equals("0")) {
                    correcta.add(i);
                }
            }
            listaDeListasCorrecta.add(correcta);
        }
        for (int i=0; i<listaDeListasCorrecta.size();i++) {
            if(!listaDeListasCorrecta.get(i).isEmpty()){
                System.out.println(listaDeListasCorrecta.get(i));
            }
        }
    }
}
