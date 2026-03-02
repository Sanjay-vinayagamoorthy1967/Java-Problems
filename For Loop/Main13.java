import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int count1 = 0;
        for(int i=0;i<n;i++){
            String donorName =sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemoglobin = sc.nextDouble();
            String Status = "Not Eligible";
            String Reason = "age";
            if(age>=18 && age<=65){
                Reason = "weight";
                if(weight>=50){
                    Reason = "hemoglobin";
                    if(hemoglobin>=12.5){
                        Status = "Eligible";
                        count++;
                    }else{
                        count1++;
                    }
                }else{
                    count1++;
                }
            }else{
                count1++;
            }
            System.out.println();
            System.out.println("Donor: "+donorName);
            System.out.println("Age: "+age+" Years");
            System.out.println("Weight: "+weight+" kg");
            System.out.println("Hemoglobin: "+hemoglobin+" g/dL");
            System.out.println("Status: "+Status);
            if(Status.equals("Not Eligible")){
                if(Reason.equals("age") && age<18){
                    System.out.println("Reason: Age below 18 years");
                }else if(age>65){
                    System.out.println("Reason: Age above 65 years");
                }
                if(Reason.equals("weight")){
                    System.out.println("Reason: Weight below 50 kg");
                }
                if(Reason.equals("hemoglobin")){
                    System.out.println("Reason: Hemoglobin below 12.5 g/dL");
                }
                
            }
            
        }
            double Eligibility = ((double)count/n)*100;
            System.out.println();
            System.out.println("Total Donors: "+n);
            System.out.println("Eligible Donors: "+count);
            System.out.println("Rejected Donors: "+count1);
            System.out.printf("Eligibility Rate: %.1f%%",Eligibility);
            sc.close();
    }
}
