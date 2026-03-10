import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int d = sc.nextInt();
        int perfect=0;
        double count = 0;
        System.out.println("Attendance Matrix:");
        for(int i =0;i<s;i++){
            
            if(i==0){
            for(int k=1;k<=d;k++){
                if(k==1){
                    System.out.print("Student ");
                }
                System.out.print("Day"+k+" ");
                if(k==d){
                System.out.println("Attendance%");
                }
            }
            }
            String name = sc.next();
            System.out.print(name+" ");
            for(int j=1;j<=d;j++){
                char ch = sc.next().charAt(0);
                if(ch=='p' || ch=='P'){
                    System.out.print(ch+" ");
                    count++;
                }else{
                    System.out.print(ch+" ");
                }
            }
                double average = count/d*100;
                if(average==100){
                    perfect++;
                }
                System.out.printf("%.2f%%",average);
                average = 0;
                count = 0;
                System.out.println();
        }
        System.out.println("Perfect Attendance: "+perfect+" students");
        sc.close();
    }
}
