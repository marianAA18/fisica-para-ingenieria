import java.util.Scanner;

public class Solucion_ecuaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1, b1, c1, a2, b2, c2, x, y;
        System.out.println("Introduce los coeficientes de la primera ecuacion:");
        a1 = sc.nextDouble();
        b1 = sc.nextDouble();
        c1 = sc.nextDouble();
        System.out.println("Introduce los coeficientes de la segunda ecuacion:");
        a2 = sc.nextDouble();
        b2 = sc.nextDouble();
        c2 = sc.nextDouble();

        // Método de Sustitución
        y = 0;
        x = (c1 - b1 * y) / a1;
        y = (c1 - a1 * x) / b1;
        System.out.println("La solucion del sistema utilizando el metodo de Sustitucion es: x = " + x + ", y = " + y);

        // Método de Igualación
        x = (c1 * b2 - c2 * b1) / (a1 * b2 - a2 * b1);
        y = (c1 - a1 * x) / b1;
        System.out.println("La solucion del sistema utilizando el metodo de Igualacion es: x = " + x + ", y = " + y);

        // Método de Reducción
        x = (c1 * b2 - c2 * b1) / (a1 * b2 - a2 * b1);
        y = (c1 * a2 - c2 * a1) / (b1 * a2 - b2 * a1);
        System.out.println("La solucion del sistema utilizando el metodo de Reduccion es: x = " + x + ", y = " + y);
    }
}