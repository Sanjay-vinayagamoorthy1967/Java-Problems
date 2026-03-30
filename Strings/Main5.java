import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("URL Analysis:");

        for (int i = 1; i <= n; i++) {

            String url = sc.nextLine();
            String temp = url;

            // Step 1: Remove protocol (http://, https://, ftp:// etc.)
            int pos = temp.indexOf("://");
            if (pos != -1) {
                temp = temp.substring(pos + 3);
            }

            // Step 2: Remove "www." if present
            if (temp.startsWith("www.")) {
                temp = temp.substring(4);
            }

            // Step 3: Remove path after domain
            int slashIndex = temp.indexOf('/');
            if (slashIndex != -1) {
                temp = temp.substring(0, slashIndex);
            }

            // Output
            System.out.println(i + ". " + url + " -> Domain: " + temp);
        }

        sc.close();
    }
}