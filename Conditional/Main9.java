import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double annualRevenue = sc.nextDouble();
        String businessType = sc.next();
        Double deductibleExpenses = sc.nextDouble();
        Double taxCredits = sc.nextDouble();
        double TaxableIncome = annualRevenue-deductibleExpenses;
        int TaxRate = 0;
        if(businessType.equals("C-Corp")){
            if(TaxableIncome<500000){
                TaxRate = 21;
            }else if(TaxableIncome>=500000 && TaxableIncome<1000000){
                TaxRate = 24;
            }else if(TaxableIncome>=1000000 && TaxableIncome<2000000){
                TaxRate = 28;
            }else if(TaxableIncome>=2000000){
                TaxRate = 30;
            }
        }if(businessType.equals("S-Corp")){
            if(TaxableIncome<500000){
                TaxRate = 20;
            }else if(TaxableIncome>=500000 && TaxableIncome<1000000){
                TaxRate = 25;
            }else if(TaxableIncome>=1000000){
                TaxRate = 28;
            }
        }if(businessType.equals("LLC")){
            if(TaxableIncome<200000){
                TaxRate = 15;
            }else if(TaxableIncome>=200000 && TaxableIncome<500000){
                TaxRate = 18;
            }else if(TaxableIncome>=500000){
                TaxRate = 22;
            }
        }if(businessType.equals("Partnership")){
            if(TaxableIncome<300000){
                TaxRate = 18;
            }else if(TaxableIncome>=300000 && TaxableIncome<=800000){
                TaxRate = 22;
            }else if(TaxableIncome>800000){
                TaxRate = 26;
            }
        }
        double  grosstax = (TaxableIncome*TaxRate)/100;
        double  nettax = grosstax- taxCredits;
        double effectiverate = (nettax/annualRevenue)*100;
        System.out.println("Annual Revenue: $"+annualRevenue);
        System.out.println("Business Type: "+businessType);
        System.out.println("Deductible Expenses: "+deductibleExpenses);
        System.out.println("Tax Credits: $"+taxCredits);
        System.out.println("Taxable Income: $"+TaxableIncome);
        System.out.println("Tax Rate: "+TaxRate+"%");
        System.out.println("Gross Tax: $"+grosstax);
        System.out.println("Net Tax After Credits: $"+nettax);
        System.out.printf("Effective Tax Rate: %.1f%%",effectiverate);
        sc.close();
    }
}
