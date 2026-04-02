import java.util.*;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Masked Data:");

        for (int i = 1; i <= n; i++) {
            String card = sc.nextLine();

            // Extract only digits
            String digits = card.replaceAll("[^0-9]", "");

            // Get last 4 digits
            String last4;
            if (digits.length() <= 4) {
                last4 = digits;
            } else {
                last4 = digits.substring(digits.length() - 4);
            }

            String result = "";

            // Check format
            if (card.contains("-")) {
                result = "---" + last4;
            } 
            else if (card.contains(" ")) {
                int spaceCount = 0;
                for (char c : card.toCharArray()) {
                    if (c == ' ') {
                        spaceCount++;
                    }
                }
                result = " ".repeat(spaceCount) + last4;
            } 
            else {
                result = last4;
            }

            System.out.println(i + ". " + result);
        }

        sc.close();
    }
}