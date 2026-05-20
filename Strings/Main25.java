import java.util.*;

public class Main25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pattern = sc.nextLine();
        String text = sc.nextLine();

        int count = 0;
        int index = 0;

        while (true) {
            index = text.indexOf(pattern, index);

            if (index == -1) {
                break;
            }

            count++;
            index = index + 1; // move only 1 step → overlapping allowed
        }

        System.out.println("Occurrences: " + count);
    }
}