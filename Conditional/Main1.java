import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rating = sc.nextInt();
        int year = sc.nextInt();
        String type = sc.next();
        double salary = sc.nextDouble();
        int bonus=0;
        double add=0;
       
            if(type.equals("Critical")){
                
                if(rating==5 && year>=5){
                    bonus = 25;
                }else if(rating==4 && year>=10){
                    bonus=22;
                }else if(rating==4){
                    bonus = 15;
                }else if (rating==3){
                    bonus = 10;
                }
            }
            if(type.equals("Non-Critical")){
                
                if(rating==5){
                    bonus = 18;
                }else if(rating==4){
                    bonus=12;
                }else if (rating==3){
                    bonus = 8;
                }
            }
               add = (salary*bonus)/100;
        
        System.out.println("Performance Rating:"+rating);
        System.out.println("Years of Service:"+year);
        System.out.println("Department:"+type);
        System.out.println("Bonus Percentage:"+bonus+"%");
        System.out.println("Bonus Amount: $"+add);
        if(rating>=3){
            System.out.println("Status: Eligible");
        }else{
            System.out.println("Status: Not Eligible");
        }
        sc.close();
        
    }
}
