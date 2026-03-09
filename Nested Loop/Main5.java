import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int n1 = sc.nextInt();
           System.out.println("Calendar Grid:");
           System.out.println("Mon Tue Wed Thu Fri Sat Sun");
           int number = (7-n1)+1;
           int num = 7-number;
           int count = 1;
           int k=1;
           for(int i=1;k<=n;i++){
                if(i<=num){
                    System.out.print("  ");
                }else{
                    System.out.print(k+" ");
                    k++;
                }
               for(int j=count;j==7;j++){
                    System.out.println();
                    count = 0;
               }
               count++;
           }
           sc.close();
    }
}
