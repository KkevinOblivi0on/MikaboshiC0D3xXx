import java.util.Scanner;
import java.util.Arrays;

public class PuntoOchoArregloCalculadora {
	public static void mostrarResultado(int[] resultado) {
	    System.out.print("[");
	    for (int i = 0; i < resultado.length; i++) {
	        if (i == resultado.length - 1) {
	            System.out.print(resultado[i]);
	        } else {
	            System.out.print(resultado[i] + ", ");
	        }
	    }
	    System.out.println("]");
	}

    static Scanner scanner = new Scanner(System.in);
    static int[] arregloA;
    static int[] arregloB;
    
    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("Menú:");
            System.out.println("A. Ingresar arreglo A");
            System.out.println("B. Ingresar arreglo B");
            System.out.println("C. Mostrar A + B");
            System.out.println("D. Mostrar A - B");
            System.out.println("E. Mostrar A * B");
            System.out.println("F. Salir");
            System.out.print("Ingrese una opción: ");
            String opcion = scanner.nextLine();
            switch (opcion.toUpperCase()) {
                case "A":
                    arregloA = ingresarArreglo();
                    break;
                case "B":
                    arregloB = ingresarArreglo();
                    break;
                case "C":
                    if (arregloA == null || arregloB == null) {
                        System.out.println("Debe ingresar ambos arreglos primero.");
                    } else {
                        mostrarResultado(sumaArreglos(arregloA, arregloB));
                    }
                    break;
                case "D":
                    if (arregloA == null || arregloB == null) {
                        System.out.println("Debe ingresar ambos arreglos primero.");
                    } else {
                        mostrarResultado(restaArreglos(arregloA, arregloB));
                    }
                    break;
                case "E":
                    if (arregloA == null || arregloB == null) {
                        System.out.println("Debe ingresar ambos arreglos primero.");
                    } else {
                        mostrarResultado(multiplicaArreglos(arregloA, arregloB));
                    }
                    break;
                case "F":
                    salir = true;
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor intente de nuevo.");
                    break;
            }
        }
    }
    
    public static int[] ingresarArreglo() {
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de la entrada de tamaño
        int[] arreglo = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el elemento " + i + ": ");
            arreglo[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de cada entrada
        }
        System.out.println("Arreglo ingresado: " + Arrays.toString(arreglo));


        return arreglo;
    }
    
    public static int[] sumaArreglos(int[] arregloA, int[] arregloB) {
        int[] resultado = new int[arregloA.length];
        for (int i = 0; i < arregloA.length; i++) {
            resultado[i] = arregloA[i] + arregloB[i];
        }
        return resultado;
    }
    
    public static int[] restaArreglos(int[] arregloA, int[] arregloB) {
        int[] resultado = new int[arregloA.length];
        for (int i = 0; i < arregloA.length; i++) {
            resultado[i] = arregloA[i] - arregloB[i];
        }
        return resultado;
    }
    public static int[] multiplicaArreglos(int[] arregloA, int[] arregloB) {
        int[] resultado = new int[arregloA.length];
        for (int i = 0; i < arregloA.length; i++) {
            resultado[i] = arregloA[i] * arregloB[i];
        }
        return resultado;
    }  
}
