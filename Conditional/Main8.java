import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String location = sc.next();
         int footage = sc.nextInt();
         int age = sc.nextInt();
         int score = sc.nextInt();
         double num=0;
         if(location.equals("Prime")){
            num=400;
         }else if(location.equals("Urban")){
            num=300;
         }else if(location.equals("Suburban")){
            num=180;
         }else if(location.equals("Rural")){
            num=100;
         }
         int num1=0;
         if(age>=0 && age<=5){
            num1=0;
         }else if(age>=6 && age<=10){
            num1=-5;
         }else if(age>=11 && age<=15){
            num1=-10;
         }else if(age>=16 && age<=25){
            num1=-15;
         }else if(age>=26 && age<=30){
            num1=-20;
         }else if(age>=31 && age<=50){
            num1=-25;
         }else if(age>=51){
            num1=-35;
         }
         
         double value = footage*num;
         double adjusted = value*(1+num1/100.0);
         // if(score>=80 && score<=100){
         //    double num2=(value*0.10);
         // }else if(score>=60 && score<=79){
         //    double num2=(value*0.05);
            
         // }else if(score>=40 && score<=59){
         //    double num2=(value*0.02);
           
         // }else if(score<40){
         //    double num2=(value*0.0);
            
         // }
         
         double finalvalue = adjusted+value;
         int number = 0;
         

        if(location.equals("Prime") || location.equals("Urban")){
            number = 1;   
        }else if(location.equals("Suburban")){
            number = 3;   
        }else{
            number = 2;   
        }
         System.out.println("Location Tier: "+location);
         System.out.println("Square Footage: "+footage+" sq ft");
         System.out.println("Property Age: "+age+" years");
         System.out.println("Amenity Score: "+score);
         System.out.println("Base Price Per Sq Ft: $"+num);
         System.out.println("Age Adjustment: "+num1+"%");
            System.out.println("Amenity Bonus: $"+adjusted);
         System.out.println("Estimated Property Value: $"+finalvalue);
         if(number==1){
            System.out.println("Market Category: Hot");
         }else if(number==2){
            System.out.println("Market Category: Slow");
         }else if(number==3){
            System.out.println("Market Category: Stable");
         }  
         sc.close();
    }
}
