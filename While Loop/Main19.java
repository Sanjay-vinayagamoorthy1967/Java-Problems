import java.util.Scanner;
public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int rev = 0;
        int count = 0;
        int count1 = 0;
        while(n>0){
            count++;
            if(n%2==0){
                num = 0;
            }else{
                num = 1;
            }
            rev = rev*10+num;
            n = n/2;
        }
        int temp = rev;
        while(temp!=0){
            count1++;
            temp = temp/10;
        }
        count = count-count1;
        while(count!=0){
            rev = rev*10+0;
            count--;
        }
        System.out.println("Binary: "+rev);
        sc.close();
    }
}
