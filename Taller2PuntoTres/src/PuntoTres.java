import java.util.Scanner;

public class PuntoTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Ingrese el número de personas que se han apuntado para el viaje: ");
    int numPersonas = input.nextInt();

  int numAutobuses = numPersonas / 45;
   int numFurgonetas = numPersonas % 45;
   
   
   
   
   
   
  System.out.println("Se necesitan " + numAutobuses + " autobuses.");
  System.out.println("Viajarán en furgoneta " + numFurgonetas + " personas.");

        input.close();
    }
}
