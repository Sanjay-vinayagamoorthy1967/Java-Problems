import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        System.out.println("Employee Contact Book:");
        int total = 0;
        for(int i=0;i<n;i++){
            int n1 = sc.nextInt();
            arr[i] = new int[n1];
            for(int j=0;j<n1;j++){
                arr[i][j]=sc.nextInt();
                total++;
            }
            for(int l=0;l<arr[i].length;l++){
                if(l==0){
                    System.out.print("Dept "+(i+1)+":");
                }
                System.out.print(arr[i][l]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Employees: "+total);
        sc.close();
    }
}
