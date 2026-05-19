import java.util.*;

public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxWidth = sc.nextInt();
        sc.nextLine();

        String text = sc.nextLine();
        String[] words = text.split(" ");

        System.out.println("Formatted Text:");

        StringBuilder line = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // If word itself is longer than maxWidth → split it
            while (word.length() > maxWidth) {
                if (line.length() > 0) {
                    System.out.println(line.toString());
                    line.setLength(0);
                }
                System.out.println(word.substring(0, maxWidth));
                word = word.substring(maxWidth);
            }

            // Check if adding word exceeds width
            if (line.length() == 0) {
                line.append(word);
            } else if (line.length() + 1 + word.length() <= maxWidth) {
                line.append(" ").append(word);
            } else {
                // Print current line and start new
                System.out.println(line.toString());
                line.setLength(0);
                line.append(word);
            }
        }

        // Print last line
        if (line.length() > 0) {
            System.out.println(line.toString());
        }
        sc.close();
    }
}