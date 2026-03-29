import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int len = str.length();
        String compressed = "";

        for (int i = 0; i < len; i++) {

            int count = 1;

            // count consecutive characters
            while (i < len - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            compressed = compressed + str.charAt(i) + count;
        }

        // lengths
        int originalLength = len;
        int compressedLength = compressed.length();

        // compression ratio
        double ratio = ((originalLength - compressedLength) * 100.0) / originalLength;

        // output
        System.out.println("Original: " + str);
        System.out.println("Compressed: " + compressed);
        System.out.printf("Compression Ratio: %.2f%%", ratio);

        sc.close();
    }
}