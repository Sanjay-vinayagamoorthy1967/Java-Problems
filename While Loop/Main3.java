import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = sc.nextInt();
        int attempts = 0;
        while(secretNumber!=0){
            int guesses = sc.nextInt();
            attempts++;
            System.out.println("Guess the number (1100): "+guesses);
            if(guesses==secretNumber){
                System.out.println("Correct! Attempts: "+attempts);
            }else if(guesses>secretNumber){
                System.out.println("Too high!");
            }else if(guesses<secretNumber){
                System.out.println("Too Low!");
            }
        }
        sc.close();
    }
}
