import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class convertidor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        Map<Character, String> leetMap = new HashMap<>();
        leetMap.put('a', "4");
        leetMap.put('e', "3");
        leetMap.put('l', "1");
        leetMap.put('o', "0");
        leetMap.put('t', "7");
        leetMap.put('g', "6");
        leetMap.put('q', "9");
        leetMap.put('z', "2");
        leetMap.put('s', "5");
        leetMap.put('b', "8");
        leetMap.put('c', "[");
        leetMap.put('i', "!");
        leetMap.put('r', "|2");
        leetMap.put('k', "|<");
        leetMap.put('h', "|-|");
        leetMap.put('w', "vv");
        leetMap.put('m', "|\\/|");
        leetMap.put('n', "|\\|");
        leetMap.put('u', "|_|");
        leetMap.put('d', "|)");
        leetMap.put('v', "\\/");
       
        System.out.print("Ingrese una oracion: ");
        String input = scanner.nextLine();

        
        String leetOutput = convertToLeet(input, leetMap);

        
        System.out.println("traduccion leet: " + leetOutput);
    }

    private static String convertToLeet(String input, Map<Character, String> leetMap) {
        StringBuilder leetOutput = new StringBuilder();

       
        for (char c : input.toLowerCase().toCharArray()) {
            if (leetMap.containsKey(c)) {
                leetOutput.append(leetMap.get(c));
            } else {
                leetOutput.append(c);
            }
        }

        return leetOutput.toString();
    }
}
