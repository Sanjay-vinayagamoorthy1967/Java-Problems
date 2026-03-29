import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("DNA Sequence Analysis:");

        for (int i = 1; i <= n; i++) {

            String str = sc.nextLine();
            String s = str.toLowerCase(); // case-insensitive

            int left = 0;
            int right = s.length() - 1;

            boolean isPalindrome = true;

            // two-pointer check
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println(i + ". " + str + " - Palindrome");
            } else {
                System.out.println(i + ". " + str + " - Not Palindrome");
            }
        }

        sc.close();
    }
}