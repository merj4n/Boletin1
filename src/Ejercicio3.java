public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        try {
            ME1();
        } catch (NullPointerException e) {
            System.out.println("Error de puntero nulo");
        } catch (RuntimeException e){
            System.out.println("Error en tiempo de ejecucion");
        } catch (ME2 Exception){
            System.out.println("Excepcion en ME2");
        } catch (ME1 Exception){
            System.out.println("Excepcion en ME1");
        } catch (Exception e){
            System.out.println("Capturo cualquier error");
        }
    }

    private static void ME1() throws Exception {
        ME2();
    }

    private static void ME2() throws Exception {
       //throw new NullPointerException("Problaticorrrrr!!");
       //throw new RuntimeException("Doy problemarrrrss!!");
       //throw new ME1();
       //throw new ME2();

    }
}
