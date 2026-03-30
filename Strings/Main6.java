import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        // Step 1: lowercase
        input = input.toLowerCase();

        // Step 2: remove punctuation
        input = input.replaceAll("[^a-z ]", "");

        // Step 3: split words
        String[] words = input.split("\\s+");

        // Step 4: visited array
        boolean[] visited = new boolean[words.length];

        System.out.println("Word Frequency Report:");

        int uniqueCount = 0;

        // Step 5: Count manually
        for (int i = 0; i < words.length; i++) {

            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(words[i] + ": " + count);
            uniqueCount++;
        }

        System.out.println("Total Unique Words: " + uniqueCount);
        sc.close();
    }
}