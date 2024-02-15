import java.util.Scanner;

public class CalculadoraFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el valor de n: ");
        double n = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de m: ");
        int m = scanner.nextInt();

        double resultado = n * Math.pow(10, m);

        System.out.println("El resultado de la formula es: " + resultado);
    }
}
