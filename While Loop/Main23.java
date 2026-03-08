import java.util.*;
public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String name = str.toLowerCase();
        int count = 0;
        int len = str.length();
        int i = 0;
        do{
            char nam = name.charAt(i);
            if(nam == 'a' || nam == 'e' || nam == 'i' || nam == 'o' || nam == 'u' ){
                count++;
            }
            i++;
            len--;
        }while(len>0);
        System.out.println("Vowel: "+count);
        sc.close();
    }
}
