import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Version Comparison:");

        for (int i = 1; i <= n; i++) {

            String v1 = sc.next();
            String v2 = sc.next();

            String[] num = v1.split("\\.");
            String[] num1 = v2.split("\\.");

            int len = num.length;
            int length = num1.length;

            int max = Math.max(len, length);

            // create new arrays with equal length
            String[] a = new String[max];
            String[] b = new String[max];

            // fill arrays with padding
            for (int j = 0; j < max; j++) {
                if (j < len)
                    a[j] = num[j];
                else
                    a[j] = "0";

                if (j < length)
                    b[j] = num1[j];
                else
                    b[j] = "0";
            }

            // compare
            String result = "Equal";

            for (int j = 0; j < max; j++) {
                int x = Integer.parseInt(a[j]);
                int y = Integer.parseInt(b[j]);

                if (x > y) {
                    result = "v1 is Newer";
                    break;
                } else if (y > x) {
                    result = "v2 is Newer";
                    break;
                }
            }

            System.out.println(i + ". " + v1 + " vs " + v2 + " -> " + result);
        }
        sc.close();
    }
}