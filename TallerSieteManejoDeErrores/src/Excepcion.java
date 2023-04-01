public class Excepcion {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[10] = 20;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocurrió una excepción: " + e);
        }
    }
}