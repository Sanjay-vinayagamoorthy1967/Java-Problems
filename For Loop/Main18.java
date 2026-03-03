import java.util.Scanner;
public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double HighestTemperature = 0;
        double LowestTemperature = 100000.0;
        int Hot = 0;
        int cold = 0;
        double totalTemp =0;
        int degree = 0;
        int degree1 = 0;
        for(int i=0;i<n;i++){
            int hour = sc.nextInt();
            double temperature = sc.nextDouble();
            String Status ="0";
            if(temperature>40 || temperature<0){
                Status = "Extreme";
            }else if(temperature>32 && temperature<=40){
                Status = "Hot";
            }else if(temperature>0 && temperature<=10){
                Status = "Cold";
            }else if(temperature>10 && temperature<=32){
                Status = "Normal";
            }
            if(temperature>HighestTemperature){
                HighestTemperature =temperature;
                degree = hour;
            }
            if(temperature<LowestTemperature){
                LowestTemperature =temperature;
                degree1 = hour;
            }
            if(temperature >= 32){
                Hot++;
            }else if(temperature<=10){
                cold++;
            }
            totalTemp +=temperature;
            System.out.println();
            System.out.println("Hour "+hour+": "+temperature+"*C");
            System.out.println("Status: "+Status);
        }
            double average = totalTemp/n;
            System.out.println();
            System.out.println("Total Readings: "+n);
            System.out.printf("Average Temperature: %.2f*C\n",average);
            System.out.println("Highest Temperature: "+HighestTemperature+"*C at Hour "+degree);
            System.out.println("Lowest Temperature: "+LowestTemperature+"*C at Hour "+degree1);
            System.out.println("Hot Hours: "+Hot);
            System.out.println("Cold Hours: "+cold);
            sc.close();
    }
}

