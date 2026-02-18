import java.util.Scanner;

public class Main9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usernameMatch = sc.nextInt();
        int passwordMatch = sc.nextInt();
        int accountLocked = sc.nextInt();
        if(usernameMatch==1 && passwordMatch==1 && accountLocked==0){
            System.out.println("Success");
        }else{
            System.out.println("Failed");
        }
    }
}
