public class Ejercicio1 {
    public static void main(String[] args) {

        try {
            throw new Exception("Me da error");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Entro obligatoriamente");
        }

    }
}
