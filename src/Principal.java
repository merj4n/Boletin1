import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Padre> personas = new ArrayList<Padre>();
        Padre p = new Hijo(2);
        personas.add(p);
        personas.add(new Padre(2));
        personas.add(new Hijo(2));
// TODO: mostrar la "resta" de cada uno de los objetos de
// clase Hijo en el ArrayList
        //Programación en Java
        for(Padre persona: personas) {
            if (persona instanceof Hijo){
                System.out.println("resta:" + ( (Hijo) persona).resta());//casting
            }
        }
    }

}
