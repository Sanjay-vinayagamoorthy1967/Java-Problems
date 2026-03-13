import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] rainfall = new double[4][7];
        System.out.println();
        double num = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
               rainfall [i][j] = sc.nextDouble();
              
            }
        }
        System.out.println("Rainfall Data:");
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
               num += rainfall[i][j];
                System.out.print(rainfall[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Weekly Totals:");
        int idx = 0;
        double min = 0;
        int index = 0;
        for(int i=0;i<4;i++){
            double sum = 0;
            for(int j=0;j<7;j++){
                sum += rainfall[i][j];
                idx = i+1;
               
            }
             if(sum<min || min==0){
                    min = sum;
                    index = i+1;
            }
            System.out.println();
            System.out.print("Week "+idx+": "+sum+" mm");
        }
        System.out.println();
        System.out.println("Monthly Total: "+num+ " mm");
        System.out.println("Driest Week: Week "+index+" ("+min+" mm)");
        sc.close();
    }
}
