import java.util.*;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String camelStr = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < camelStr.length(); i++) {
            char ch = camelStr.charAt(i);

            if (Character.isUpperCase(ch)) {
                // Add underscore before uppercase
                result.append("_");
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }
        }

        System.out.println("CamelCase: " + camelStr);
        System.out.println("SnakeCase: " + result.toString());
        sc.close();
    }
}