import java.util.Scanner;
public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = sc.next();
        int count=2;
        while(count>=0){
            String attempts = sc.next();
            
            System.out.println("Enter password:");
            if(attempts.equals(correctPassword)){
                System.out.println("Access granted!");
                break;
            }else if(count==0){
                System.out.println("Account locked!");
            }else{
                System.out.println("Incorrect! Attempts remaining: "+count);
            }
            
            count--;
        }
        sc.close();
    }
}