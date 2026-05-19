import java.util.*;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("IP Validation:");

        for (int i = 1; i <= n; i++) {
            String ip = sc.nextLine();
            String[] parts = ip.split("\\.");

            boolean isValid = true;

            // Check 4 parts
            if (parts.length != 4) {
                isValid = false;
            } else {
                for (String part : parts) {

                    // Check empty
                    if (part.length() == 0) {
                        isValid = false;
                        break;
                    }

                    // Check non-digit
                    for (int j = 0; j < part.length(); j++) {
                        if (!Character.isDigit(part.charAt(j))) {
                            isValid = false;
                            break;
                        }
                    }
                    if (!isValid) break;

                    // Leading zero check
                    if (part.length() > 1 && part.charAt(0) == '0') {
                        isValid = false;
                        break;
                    }

                    // Range check
                    int num = Integer.parseInt(part);
                    if (num < 0 || num > 255) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid) {
                System.out.println(i + ". " + ip + " -> Valid");
            } else {
                System.out.println(i + ". " + ip + " -> Invalid");
            }
        }
        sc.close();
    }
}