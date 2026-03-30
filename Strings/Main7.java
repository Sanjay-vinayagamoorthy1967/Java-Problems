import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   // number of flights
        sc.nextLine();          // consume newline

        System.out.println("Flight Details:");

        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine();

            // Split using "-"
            String[] parts = input.split("-");

            String airlineFlight = parts[0]; // AA123
            String from = parts[1];          // LHR
            String to = parts[2];            // JFK

            // Separate airline and flight number
            String airline = airlineFlight.replaceAll("[0-9]", "");
            String flightNo = airlineFlight.replaceAll("[A-Z]", "");

            System.out.println(i + ". Airline: " + airline +
                    ", Flight: " + flightNo +
                    ", From: " + from +
                    ", To: " + to);
        }
            sc.close();
    }
}
