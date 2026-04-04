import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String keyword = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Highlighted Text:");

        for (int i = 1; i <= n; i++) {
            String sentence = sc.nextLine();

            // (?i) makes it case-insensitive
            String result = sentence.replaceAll("(?i)" + keyword, "<b>$0</b>");

            System.out.println(i + ". " + result);
        }

        sc.close();
    }
}