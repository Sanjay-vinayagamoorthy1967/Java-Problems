import java.util.*;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        String result = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            // Uppercase letters
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)((ch - 'A' + 3) % 26 + 'A');
            }
            // Lowercase letters
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char)((ch - 'a' + 3) % 26 + 'a');
            }
            // Others remain same
            result += ch;
        }

        System.out.println("Original: " + message);
        System.out.println("Encrypted: " + result);
        
        sc.close();
    }
}
