import java.util.*;


public class Main{

    // Genera una stringa a random usando i caratteri da "a" a "z" di un certo size
    public static String generatedString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 6;
        Random random = new Random();
    
        String generatedString = random.ints(leftLimit, rightLimit + 1)
          .limit(targetStringLength)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();
    
        return generatedString;
    }

    public static void main(String[] args) {
        String s = generatedString();
        System.out.println(s);
    }
    
}
