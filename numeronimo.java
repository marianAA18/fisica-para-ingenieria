import java.util.Scanner;

public class numeronimo {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        
        if (palabra.length() > 1) {
            char primeraLetra = palabra.charAt(0);

            
            String letrasIntermedias = palabra.substring(1, palabra.length() - 1);
            int totalLetras = letrasIntermedias.length();
            
            char ultimaLetra = palabra.charAt(palabra.length() - 1);

  System.out.println("traduccion en numeronimo: " + primeraLetra + totalLetras + ultimaLetra);
        
        }
        
        scanner.close();
    }
}
