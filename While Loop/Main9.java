import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count = 0;
            }
        }
        if(count==1){
            System.out.println(n+" is Prime");
        }else{
            System.out.println(n+" is not Prime");
        }
        sc.close();
    }
}
