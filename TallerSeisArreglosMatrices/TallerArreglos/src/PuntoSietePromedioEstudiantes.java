

	import java.util.Scanner;

	public class PuntoSietePromedioEstudiantes {
	    public static void main(String[] args) {

	        try (Scanner scanner = new Scanner(System.in)) {
				double[] calificaciones = new double[5];
				
     
				for (int i = 0; i < 5; i++) {
				    System.out.print("Ingrese la calificación de la prueba #" + (i+1) + ": ");
				    calificaciones[i] = scanner.nextDouble();
				}
     
				double suma = 0;
				for (int i = 0; i < 5; i++) {
				    suma += calificaciones[i];
				}
				double promedio = suma / 5;
				
  
				System.out.println("El promedio de las calificaciones es: " + promedio);
			}
	    }
	}


