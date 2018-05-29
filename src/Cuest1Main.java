import java.util.ArrayList;

public class Cuest1Main {
    public static void main(String[] args) {
        ArrayList<Padre> personas = new ArrayList<Padre>();
        Padre p = new Hijo(2);
        personas.add(p);
        //personas.add(new Padre(2));
        personas.add(new Hijo(2));
// TODO: mostrar la "resta" de cada uno de los objetos de
// clase Hijo en el ArrayList
        //Programación en Java

        for(Padre persona: personas) {
            //System.out.println("resta:" + persona.suma());
        }
    }
}


