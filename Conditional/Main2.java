import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        double income = sc.nextDouble();
        double ratio = sc.nextDouble();
        String type = sc.next();
        double num=0;
        int sum=0;
        if(type.equals("Home")){
            if(score>=750 && ratio<=30){
                num = 4*income;
                sum=1;
            }
            if((score>=700 && score<=749) || (ratio>=31 && ratio<=40)){
                num = 3*income;
                sum=2;
            }
        }
        if(type.equals("Personal")){
            if(score>=750 && ratio<=30){
                num = 1*income;
                sum=1;
            }
            if((score>=650 && score<=699) && (ratio>=31 && ratio<=40)){
                num = 0.5*income;
                sum=2;
            }
        }
        if(type.equals("Business")){
            if((score>=750 || score>=700 && score<=749) && (ratio<=30 || ratio>=31 && ratio<=40)){
                num = 3*income;
                sum=1;
            }
        }
        System.out.println("Credit Score:"+score);
        System.out.println("Annual Income: $"+income);
        System.out.println("Debt-to-Income Ratio:"+ratio+"%");
        System.out.println("Loan Type:"+type);
        if(sum==1){
            System.out.println("Decision: Approved");
        }else if(sum==2){
            System.out.println("Decision: Needs Review");
        }else if(score>600 || ratio>50){
            System.out.println("Decision: Rejected");
        }
        System.out.println("Maximum Loan Amount: $"+num);
        sc.close();
    }
}
