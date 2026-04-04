import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String str = sc.nextLine().toLowerCase();
            String result = str.replaceAll("[^a-z0-9 ]", "");
            System.out.println(i +". "+result);
        }
        sc.close();
    }
}
