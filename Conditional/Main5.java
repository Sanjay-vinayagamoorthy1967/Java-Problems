import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gpa = sc.nextDouble();
        double income = sc.nextDouble();
        int score = sc.nextInt();
        String type = sc.next();
        int num=0;
        if(gpa>=2.5){
            num = 1;
        }
        double amount=0;
        int count=0;
        if(type.equals("Merit")){
            if(gpa>=3.8 && score>=80){
                amount = 25000;
                count=1;
            }
            else if(gpa>=3.5 && score>=70){
                amount = 15000;
                count=2;
            }
            else if(gpa>=3.0 && score>=60){
                amount = 8000;
                count=3;
            }
        }
        if(type.equals("Need-Based")){
            if(gpa>=3.5 && income<=30000){
                amount = 30000;
                count=1;
            }
            else if(gpa>=3.0 && income<=50000){
                amount = 18000;
                count=2;
            }
            else if(gpa>=2.8 && income<=70000){
                amount = 10000;
                count=3;
            }
        }
        if(type.equals("Sports")){
            if(gpa>=3.0 && score>=85){
                amount = 22000;
                count=1;
            }
            else if(gpa>=2.8 && score>=75){
                amount = 20000;
                count=2;
            }
            else if(gpa>=2.5 && score>=65){
                amount = 12000;
                count=3;
            }
        }
        System.out.println("GPA: "+gpa);
        System.out.println("Family Income: "+income);
        System.out.println("Extracurricular Score: "+score);
        System.out.println("Scholarship Type: "+type);
        if(num==1){
        System.out.println("Eligibility: Eligible");
        }else{
            System.out.println("Eligibility: Not Eligible");   
        }
        System.out.println("Award Amount: $"+amount);
        if(count==1){
            System.out.println("Award Category: Full");
        }else if(count==2){
            System.out.println("Award Category: Partial");
        }else if(count==3){
            System.out.println("Award Category: Minimal");
        }else{
            System.out.println("Award Category: None");
        }

        sc.close();
    }
}
