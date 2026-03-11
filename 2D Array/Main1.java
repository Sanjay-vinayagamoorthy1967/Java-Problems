import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Student Averages:");
        for(int i=0;i<r;i++){
            double sum = 0;
            for(int j=0;j<c;j++){
                sum += arr[i][j];
            }
            sum = sum/c;
            int result = (int)(sum * 100);
            System.out.printf("Student %d: %d",i+1,result);
            System.out.println();
            
        }
        System.out.println();
        System.out.println("Subject Averages:");
        for(int k=0;k<c;k++){
            double num = 0;
            for(int l=0;l<r;l++){
                num +=arr[l][k];
            }
            num = num/r;
            int result = (int)(num * 100); 
            System.out.printf("Subject %d: %d",k+1,result); 
            System.out.println();    
            sc.close();  
        }
        
    }
}
