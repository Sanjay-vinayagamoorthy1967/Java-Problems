import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.next().toLowerCase();
            String str1 = sc.next().toLowerCase();

            if (str.length() != str1.length()) {
                System.out.println((i+1)+". "+str+" & "+str1+ " -> Not Anagram");
                continue;
            }

            char[] arr = str1.toCharArray();
            boolean isAnagram = true;

            for (int j = 0; j < str.length(); j++) {
                boolean found = false;

                for (int k = 0; k < arr.length; k++) {
                    if (str.charAt(j) == arr[k]) {
                        arr[k] = '#'; // mark as used
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println((i+1)+". "+str+" & "+str1+ " -> Anagram");
            } else {
                System.out.println((i+1)+". "+str+" & "+str1+ " -> Not Anagram");
            }
        }
        sc.close();
    }
}
