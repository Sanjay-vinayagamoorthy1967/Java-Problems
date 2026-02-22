import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heart = sc.nextInt();
        String pressure = sc.next();
        double temperature = sc.nextDouble();
        String symptom = sc.next();
        int count=0;
        if(symptom.equals("Life-Threatening") || symptom.equals("Moderate")){
        if(heart<50 || heart>130){
            if(pressure.compareTo("180")<=100000 && pressure.compareTo("90")<=0){
                if(temperature>103 || temperature<96){
                    count = 1;
                }
            }
        }
        }
        if(symptom.equals("Severe" ) || symptom.equals("Moderate")){
            if((heart>=50 && heart<=60) || (heart>=110 && heart<=130)){
                if(pressure.compareTo("160")<=180 || pressure.compareTo("90")<=100){
                    if((temperature>=101 && temperature<=103) || (temperature>=96 && temperature<=97)){
                        count =2;
                    }
                }
            }else if (symptom.equals("Moderate")){
                count=3;
            }
        }else if (symptom.equals("Mild")){
                count=4;
            }
        int num=0;
        if(count==1){
            num=1;
        }else if(count==2){
            num = 2;
        }else if(count==3){
            num=3;
        }else if(count==4){
            num =4;
        }

        System.out.println("Heart Rate: "+heart+"bpm");
        System.out.println("Blood Pressure: "+pressure);
        System.out.println("Temperature: "+temperature);
        System.out.println("Symptom Severity: "+symptom);
        if(count==1){
            System.out.println("Triage Priority: Critical");
        }else if(count==2){
            System.out.println("Triage Priority: Urgent");
        }else if(count==3){
            System.out.println("Triage Priority: Standard");
        }else if(count==4){
            System.out.println("Triage Priority: Non-Urgent");
        }

        if(num==1){
            System.out.println("Estimated Wait Time: 0 minutes");
        }else if(num==2 && symptom.equals("Severe")){
            System.out.println("Estimated Wait Time: 15 minutes");
        }else if(num==2 && symptom.equals("Moderate")){
            System.out.println("Estimated Wait Time: 20 minutes");
        }else if(num==3){
            System.out.println("Estimated Wait Time: 45 minutes");
        }else if(num==4){
            System.out.println("Estimated Wait Time: 90 minutes");
        }
        if(count==1){
            System.out.println("Recommended Action: Immediate Emergency Care");
        }else if(count==2){
            System.out.println("Recommended Action: Priority Medical Attention");
        }else if(count==3){
            System.out.println("Recommended Action: Standard Examination");
        }else if(count==4){
            System.out.println("Recommended Action: Routine Check-up");
        }
        sc.close();
    }
}
