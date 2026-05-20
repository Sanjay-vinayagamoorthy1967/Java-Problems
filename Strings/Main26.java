import java.util.Scanner;
public class Main26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next().charAt(0);
        }
        int count = 0;
        for(int i=0;i<n;i++){
           if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' ||
              arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
                continue;
              } else{
                count++;
              }
        }
        System.out.print(count);
    }
}