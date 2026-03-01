import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int TotalDuration = 0;
        int TotalCaloriesBurned = 0;
        for(int i=1;i<=n;i++){
            String exerciseType = sc.next();
            int durationMinutes = sc.nextInt();
            int CaloriesBurned = 0;
            String intensity ="0";
            if(exerciseType.equals("Running")){
                CaloriesBurned = durationMinutes*10;
                intensity = "High";
            }else if(exerciseType.equals("Swimming")){
                CaloriesBurned = durationMinutes*12;
                intensity = "High";
            }else if(exerciseType.equals("Cycling")){
                CaloriesBurned = durationMinutes*8;
                intensity = "Moderate";
            }else if(exerciseType.equals("Gym")){
                CaloriesBurned = durationMinutes*7;
                intensity = "Moderate";
            }else if(exerciseType.equals("Walking")){
                CaloriesBurned = durationMinutes*4;
                intensity = "Low";
            }
            TotalDuration = TotalDuration+durationMinutes;
            TotalCaloriesBurned = TotalCaloriesBurned+CaloriesBurned;
            System.out.println();
            System.out.println("Session "+i+":"+exerciseType);
            System.out.println("Duration: "+durationMinutes+" minutes");
            System.out.println("Calories Burned: "+CaloriesBurned);
            System.out.println("Intensity: "+intensity);
        }
            double averagecalories = TotalCaloriesBurned / n;
            String fitnesslevel = "0";
            if(TotalCaloriesBurned<300){
                fitnesslevel = "Beginner";
            }else if(TotalCaloriesBurned>300 && TotalCaloriesBurned<=1000){
                fitnesslevel = "Intermediate";
            }else if(TotalCaloriesBurned>1000){
                fitnesslevel = "Advanced";
            }
            System.out.println();
            System.err.println("Total Workouts: "+n);
            System.out.println("Total Duration: "+TotalDuration+" minutes");
            System.out.println("Total Calories Burned: "+TotalCaloriesBurned);
            System.out.println("Average Calories per Session: "+averagecalories);
            System.out.println("Fitness Level: "+fitnesslevel);
            sc.close();
    }
}
