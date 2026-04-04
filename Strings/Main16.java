import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Critical Logs:");
        int count = 0;
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            if(str.contains("ERROR")){
                count++;
                System.out.println(count +". "+str);
            }else if(str.contains("EXCEPTION")){
                count++;
                System.out.println(count +". "+str);
            }
        }
        System.out.println("Total Errors Found: "+ count);
        sc.close();
    }
}
