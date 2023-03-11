import java.util.Scanner;

public class PuntoUno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double base = input.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = input.nextDouble();

        double area = 0.5 * base * altura;

        System.out.println("El area del triángulo es: " + area);

        System.out.print("Ingrese el valor de x: ");
        double x = input.nextDouble();

        double a = Math.sqrt(Math.pow(x, 5) - 6) / 4;

        System.out.println("El valor de a es: " + a);

        System.out.print("Ingrese el valor de x:");
        x = input.nextDouble();

        System.out.print("Ingrese el valor de y:");
        double y = input.nextDouble();

        double b = Math.pow(x, y) - Math.pow(6, x);

        System.out.println("El valor de b es: " + b);

        System.out.print("Ingrese el valor de x:");
        x = input.nextDouble();

        System.out.print("Ingrese el valor de z:");
        double z = input.nextDouble();

        double c = 4 * Math.cos(z/5) - Math.sin(Math.pow(x, 2));

        System.out.println("El valor de c es: " + c);

        System.out.print("Ingrese el valor de x:");
        x = input.nextDouble();

        System.out.print("Ingrese el valor de y:");
        y = input.nextDouble();

        double d = Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(y, 3));

        System.out.println("El valor de d es: " + d);

        System.out.print("Ingrese el valor de x:");
        x = input.nextDouble();

        System.out.print("Ingrese el valor de y:");
        y = input.nextDouble();

        double e = 1/(y - 1/(x - Math.pow(2, y)));

        System.out.println("El valor de e es: " + e);

        System.out.print("Ingrese el valor de x:");
        x = input.nextDouble();

        double f = 7 * Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 * x - 4))));

        System.out.println("El valor de f es: " + f);

        input.close();
    }
}
