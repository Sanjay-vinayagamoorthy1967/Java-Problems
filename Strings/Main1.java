import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int valid = 0;
        int invalid = 0;

        System.out.println("Email Validation Results:");

        for (int i = 0; i < n; i++) {

            String email = arr[i];
            int len = email.length();

            boolean isValid = true;
            int atCount = 0;
            int atIndex = -1;

            // Rule 1: start/end check
            if (email.charAt(0) == '@' || email.charAt(0) == '.' ||
                email.charAt(len - 1) == '@' || email.charAt(len - 1) == '.') {
                isValid = false;
            }

            // Count '@'
            for (int j = 0; j < len; j++) {
                if (email.charAt(j) == '@') {
                    atCount++;
                    atIndex = j;
                }
            }

            // Rule 2: exactly one '@'
            if (atCount != 1) {
                isValid = false;
            }

            // Rule 3: '.' after '@'
            boolean dotFound = false;

            for (int j = atIndex + 1; j < len; j++) {
                if (email.charAt(j) == '.') {
                    dotFound = true;

                    // '.' immediately after '@'
                    if (j == atIndex + 1) {
                        isValid = false;
                    }

                    // '.' at end
                    if (j == len - 1) {
                        isValid = false;
                    }
                }
            }

            if (!dotFound) {
                isValid = false;
            }

            // Output format
            if (isValid) {
                System.out.println((i + 1) + ". " + email + " - Valid");
                valid++;
            } else {
                System.out.println((i + 1) + ". " + email + " - Invalid");
                invalid++;
            }
        }

        System.out.println("Total Valid: " + valid);
        System.out.println("Total Invalid: " + invalid);
        sc.close();
    }
}