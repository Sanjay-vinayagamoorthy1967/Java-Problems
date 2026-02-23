import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentStatus = sc.next();
        int creditHours = sc.nextInt();
        String programType = sc.next();
        String residency = sc.next();
        double BaseTuitionPerCredit = 0;
        if(programType.equals("Undergraduate")){
            BaseTuitionPerCredit=350;
        }else if(programType.equals("Graduate")){
            BaseTuitionPerCredit=550;
        }else if(programType.equals("Professional")){
            BaseTuitionPerCredit=800;
        }
        double ResidencyMultiplier = 0;
        if(residency.equals("In-State")){
            ResidencyMultiplier=1.0;
        }else if(residency.equals("Out-of-State")){
            ResidencyMultiplier=2.5;
        }else if(residency.equals("International")){
            ResidencyMultiplier=3.0;
        }
        double ProgramFee = 0;
        if(studentStatus.equals("Full-Time")){
            if(programType.equals("Undergraduate")){
                ProgramFee = 500;
            }else if(programType.equals("Graduate")){
                ProgramFee = 750;
            }else if(programType.equals("Professional")){
                ProgramFee = 1200;
            }else if(studentStatus.equals("Continuing-Education")){
                ProgramFee = 150;
            }
        }
         if(studentStatus.equals("Part-Time")){
            if(programType.equals("Undergraduate")){
                ProgramFee = 300;
            }else if(programType.equals("Graduate")){
                ProgramFee = 750;
            }else if(programType.equals("Professional")){
                ProgramFee = 900;
            }else if(studentStatus.equals("Continuing-Education")){
                ProgramFee = 150;
            }
        }
        double StudentActivityFee = 0;
        if(studentStatus.equals("Full-Time")){
            StudentActivityFee = 200;
        }else  if(studentStatus.equals("Part-Time")){
            StudentActivityFee = 100;
        }else if(studentStatus.equals("Continuing-Education")){
            StudentActivityFee = 50;
        }
        double tuitionCost = creditHours * BaseTuitionPerCredit * ResidencyMultiplier;
        double totalFee = tuitionCost + ProgramFee + StudentActivityFee;
        System.out.println("Student Status: "+studentStatus);
        System.out.println("Credit Hours: "+creditHours);
        System.out.println("Program Type: "+programType);
        System.out.println("Residency: "+residency);
        System.out.println("Base Tuition Per Credit: $"+BaseTuitionPerCredit);
        System.out.println("Residency Multiplier: "+ResidencyMultiplier+"x");
        System.out.println("Program Fee: $"+ProgramFee);
        System.out.println("Student Activity Fee: $"+StudentActivityFee);
        System.out.println("Total Registration Fee: $"+totalFee);
        if(studentStatus.equals("Full-Time") && (residency.equals("In-State"))){
            System.out.println("Fee Category: Standard");
        }else if(studentStatus.equals("Continuing-Education")){
            System.out.println("Fee Category: Reduced");
        }else if(residency.equals("Out-of-State") || (residency.equals("International"))){
            System.out.println("Fee Category: Premium");
        }
            sc.close();
    }
}
