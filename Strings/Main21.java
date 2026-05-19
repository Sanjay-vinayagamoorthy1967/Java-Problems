import java.util.*;

public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String morseMessage = sc.nextLine();

        // Morse to English mapping
        HashMap<String, String> morseMap = new HashMap<>();

        morseMap.put(".-", "A");
        morseMap.put("-...", "B");
        morseMap.put("-.-.", "C");
        morseMap.put("-..", "D");
        morseMap.put(".", "E");
        morseMap.put("..-.", "F");
        morseMap.put("--.", "G");
        morseMap.put("....", "H");
        morseMap.put("..", "I");
        morseMap.put(".---", "J");
        morseMap.put("-.-", "K");
        morseMap.put(".-..", "L");
        morseMap.put("--", "M");
        morseMap.put("-.", "N");
        morseMap.put("---", "O");
        morseMap.put(".--.", "P");
        morseMap.put("--.-", "Q");
        morseMap.put(".-.", "R");
        morseMap.put("...", "S");
        morseMap.put("-", "T");
        morseMap.put("..-", "U");
        morseMap.put("...-", "V");
        morseMap.put(".--", "W");
        morseMap.put("-..-", "X");
        morseMap.put("-.--", "Y");
        morseMap.put("--..", "Z");

        // Split words
        String[] words = morseMessage.split(" / ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String[] letters = word.split(" ");

            for (String letter : letters) {
                if (morseMap.containsKey(letter)) {
                    result.append(morseMap.get(letter));
                }
            }
            result.append(" "); // space between words
        }

        // Output
        System.out.println("English Translation: " + result.toString().trim());
        sc.close();
    }
}