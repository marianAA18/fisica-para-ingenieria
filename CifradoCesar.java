import java.util.Scanner;

public class CifradoCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la palabra a cifrar: ");
        String palabra = scanner.nextLine();

        System.out.print("Ingrese el número de desplazamientos: ");
        int desplazamientos = scanner.nextInt();

        String resultadoCifrado = cifrarCesar(palabra, desplazamientos);

        System.out.println("Palabra cifrada: " + resultadoCifrado);

        scanner.close();
    }

    private static String cifrarCesar(String palabra, int desplazamientos) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);

           
            if (Character.isLetter(caracter)) {
       
                int codigoAscii = (int) caracter;

                if (Character.isUpperCase(caracter)) {
                    codigoAscii = (codigoAscii - 'A' + desplazamientos) % 26 + 'A';
                } else {
                    codigoAscii = (codigoAscii - 'a' + desplazamientos) % 26 + 'a';
                }

                caracter = (char) codigoAscii;
            }

            resultado.append(caracter);
        }

        return resultado.toString();
    }
}
