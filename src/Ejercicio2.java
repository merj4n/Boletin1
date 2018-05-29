public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("Mi propio error");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
