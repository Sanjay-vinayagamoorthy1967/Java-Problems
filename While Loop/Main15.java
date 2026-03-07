import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        System.out.println("Collatz sequence starting from "+n+":");
        do{
            System.out.print(n+" ");
            if(n==1){
                break;
            }
            if(n%2==0){
                n = n/2;
            }else{
                n = 3*(n)+1;
            }
            count++;
        }while(n!=0);
        System.out.println();
        System.out.println("Steps: "+count);
        sc.close();
    }
}
