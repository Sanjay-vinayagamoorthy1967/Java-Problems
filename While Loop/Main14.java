import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int temp = n;
        int count = 0;
        int result = 1;
        int number = 0;
        while(temp!=0){
            count++;
            temp = temp/10;
        }
        while(num!=0){
            int digit = num%10;
            for(int i=0;i<count;i++){
                result = result*digit;
            }
            number += result;
            result = 1;
            num = num/10;
        }
        if(n==number){
            System.out.println(n+" is an Armstrong number");
        }else{
            System.out.println(n+" is not an Armstrong number");
        }
            sc.close();
    }
}
