import java.util.Scanner;

public class Main4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int amount = sc.nextInt();
        int blocked = sc.nextInt();
        if(limit>=amount && blocked==0){
            System.out.println("Approved");
        }else{
            System.out.println("Declined");
        }
    }
}
