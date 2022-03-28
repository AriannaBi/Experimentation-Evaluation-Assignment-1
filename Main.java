import java.util.*;


public class Main{

    // Genera una stringa a random usando i caratteri da "a" a "z" di un size 5
    public static String generatedString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();
    
        String generatedString = random.ints(leftLimit, rightLimit + 1)
          .limit(targetStringLength)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();
    
        return generatedString;
    }

    public static void main(String[] args) {
        String s = generatedString();
        int n = 1000;
        String[] f = new String[n];
        // Popolate the array and print it if we need random order
        // System.out.print("{");
        for (int i = 0; i < n; i++) {
            f[i] = generatedString();
            // System.out.print(f[i] + ",");
            // System.out.print(",");
        }
        // Print the array values in order or reverse order
        // System.out.print("}");
        Arrays.sort(f, Collections.reverseOrder());
        System.out.print("{");
        for (int i = 0; i < n; i++) {
            // f[i] = generatedString();
            System.out.print(f[i] + ",");
            // System.out.print(",");
        }
        System.out.print("}");
        
    }
     
}
