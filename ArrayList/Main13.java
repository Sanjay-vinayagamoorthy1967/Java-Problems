import java.util.*;

public class Main13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int expected = n * (n + 1) / 2;

        int actual = 0;

        for (int num : list) {
            actual += num;
        }

        int missing = expected - actual;

        System.out.println(missing);
    }
}