import java.util.Scanner;
public class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double average = 0;
        for(int i=0;i<n;i++){
            arr [i] = sc.nextDouble();
            average +=arr[i];
        }
        int total = n;
        average = average/total;
        int count = 0;
        System.out.println("Total Employees: "+total);
        for(double num :arr){
            if(num>average){
                count++;
            }
        }
        System.out.printf("Average Salary: %.2f\n",average);
        System.out.println("Employees Above Average: "+count);
        double number = (double)count;
        double percentage = (number/(double)n)*100;
        System.out.printf("Percentage: %.2f %%",percentage);
        sc.close();
    }
}