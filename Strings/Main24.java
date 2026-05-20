import java.util.*;

public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String key = sc.nextLine();
        String json = sc.nextLine();

        String target = "\"" + key + "\"";
        int index = json.indexOf(target);

        String result = "(null)";

        while (index != -1) {
            int colon = json.indexOf(":", index + target.length());
            if (colon == -1) break;

            int i = colon + 1;

            // Skip spaces
            while (i < json.length() && json.charAt(i) == ' ') {
                i++;
            }

            if (i >= json.length()) break;

            // Case 1: String value
            if (json.charAt(i) == '"') {
                i++;
                int start = i;
                while (i < json.length() && json.charAt(i) != '"') {
                    i++;
                }
                result = json.substring(start, i);
                break;
            }

            // Case 2: Number value
            else if (Character.isDigit(json.charAt(i))) {
                int start = i;
                while (i < json.length() &&
                      (Character.isDigit(json.charAt(i)))) {
                    i++;
                }
                result = json.substring(start, i);
                break;
            }

            // Case 3: Nested object → continue searching
            else if (json.charAt(i) == '{') {
                index = json.indexOf(target, i);
                continue;
            }

            index = json.indexOf(target, i);
        }

        System.out.println("Extracted Value: " + result);
        sc.close();
    }
}