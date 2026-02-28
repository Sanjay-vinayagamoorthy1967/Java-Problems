import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double OccupancyRate = 0;
        double sum = 0;
        double highest=0;
        int peakoccupancy = 0;
        int FullCapacity = 0;
        for(int i=1;i<=n;i++){
            int day = sc.nextInt();
            int roomsOccupied = sc.nextInt();
            int totalRooms = sc.nextInt();
            double occupancyrate = ((double)roomsOccupied / totalRooms)* 100.0 ;
            String status = "0";
            if(occupancyrate<60){
                status = "Low";
            }else if(occupancyrate>=60 && occupancyrate<=79){
                status = "Moderate";
            }else if(occupancyrate>=80 && occupancyrate<=99){
                status = "High";
            }else if(occupancyrate>=100){
                status = "Full";
            }
            sum = sum+occupancyrate;
            OccupancyRate = sum/n;
            if(occupancyrate>highest){
                highest = occupancyrate;
                peakoccupancy = i;
            }
            if(occupancyrate==100){
                FullCapacity++;
            }
                System.out.println();
                System.out.println("Day: "+day);
                System.out.println("Rooms Occupied: "+roomsOccupied);
                System.out.println("Total Rooms: "+totalRooms);
                System.out.println("Occupancy Rate: "+occupancyrate+"%");
                System.out.println("Status: "+status);
        }
                System.out.println();
                System.out.println("Total Days Analyzed: "+n);
                System.out.println("Average Occupancy Rate: "+OccupancyRate+"%");
                System.out.println("Peak Occupancy Day: "+peakoccupancy);
                System.out.println("Days at Full Capacity: "+FullCapacity);
                sc.close();
    }
}
