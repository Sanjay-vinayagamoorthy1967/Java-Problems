import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String smoking = sc.next();
        String conditions = sc.next();
        String tier = sc.next();
        float amount = 0;
        float num=0;
        if(tier.equals("Basic")){
            if(age>=18 && age<=30){
                amount = 200;
            }else if(age>=31 && age<=50){
                amount = 250;
            }else if(age>=51 && age<=65){
                amount = 350;
            }else{
                amount = 400;
            }
        }
        if(tier.equals("Standard")){
            if(age>=18 && age<=30){
                amount = 300;
            }else if(age>=31 && age<=50){
                amount = 350;
            }else if(age>=51 && age<=65){
                amount = 450;
            }else{
                amount = 550;
            }
        }
        
        if(tier.equals("Premium")){
            if(age>=18 && age<=30){
                amount = 500;
            }else if(age>=31 && age<=50){
                amount = 600;
            }else if(age>=51 && age<=65){
                amount = 700;
            }else{
                amount = 800;
            }
        }
        if(smoking.equals("Smoker") && conditions.equals("Yes")){
            num = (amount*70)/100;
        }else if(smoking.equals("Smoker")){
                  num = (amount*40)/100;
        }else if(conditions.equals("Yes")){
                  num = (amount*30)/100;
        }

        float total = amount+num;
        System.out.println("Age: "+age);
        System.out.println("Smoking Status: "+smoking);
        System.out.println("Pre-existing Conditions: "+conditions);
        System.out.println("Coverage Tier: "+tier);
        System.out.println("Base Premium: $"+amount);
        System.out.println("Risk Surcharge: $"+num);
        System.out.println("Total Monthly Premium: $"+total);
        sc.close();
    }
}
