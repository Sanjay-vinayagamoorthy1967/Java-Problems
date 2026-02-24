import java.util.Scanner;
public class Main14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String membershipTier = sc.next();
    int contractMonths = sc.nextInt();
    String accessLevel = sc.next();
    String addOns = sc.next();
    double BaseMonthlyFee = 0;
    if(membershipTier.equals("Basic")){
        BaseMonthlyFee = 40;
    }else if(membershipTier.equals("Premium")){
        BaseMonthlyFee = 80;
    }else if(membershipTier.equals("Elite")){
        BaseMonthlyFee = 120;
    }else if(membershipTier.equals("VIP")){
        BaseMonthlyFee = 150;
    }
    double ContractDiscount = 0;
    if(contractMonths==1){
        ContractDiscount = 0;
    }else if(contractMonths==6){
        ContractDiscount = 10;
    }else if(contractMonths==12){
        ContractDiscount = 15;
    }else if(contractMonths==24){
        ContractDiscount = 25;
    }
    double AccessFee=0;
    if(accessLevel.equals("Single-Location")){
        AccessFee = 0;
    }else if(accessLevel.equals("Regional")){
        AccessFee = 20;
    }else if(accessLevel.equals("Nationwide")){
        AccessFee = 50;
    }
    double AddOnFee = 0;
    if(addOns.equals("None")){
        AddOnFee = 0;
    }else  if(addOns.equals("Personal-Training")){
        AddOnFee = 100;
    }else  if(addOns.equals("Classes")){
        AddOnFee = 50;
    }else  if(addOns.equals("Full-Package")){
        AddOnFee = 200;
    }
    double discountedBase = BaseMonthlyFee * (1 - ContractDiscount/100);
    double monthlyTotal = discountedBase + AccessFee + AddOnFee;
    double contractTotal = monthlyTotal * contractMonths;
    double savings = (BaseMonthlyFee + AccessFee + AddOnFee) * contractMonths - contractTotal;
    System.out.println("Membership Tier:"+membershipTier);
    System.out.println("Contract Length: "+contractMonths);
    System.out.println("Access Level: "+accessLevel);
    System.out.println("Add-Ons: "+addOns);
    System.out.println("Base Monthly Fee: "+BaseMonthlyFee);
    System.out.println("Contract Discount: "+ContractDiscount+"%");
    System.out.println("Access Fee: $"+AccessFee);
    System.out.println("Add-On Fee: $"+AddOnFee);
    System.out.println("Monthly Total: $"+monthlyTotal);
    System.out.println("Contract Total: $"+contractTotal);
    System.out.println("Savings vs Month-to-Month: $"+savings);
    if(membershipTier.equals("Basic")){
       System.out.println("Membership Category: Budget");
    }else if(membershipTier.equals("Premium") && monthlyTotal<=118){
        System.out.println("Membership Category: Standard");
    }
    else if(membershipTier.equals("Premium")){
        System.out.println("Membership Category: Premium");
    }else if(membershipTier.equals("Elite")){
        System.out.println("Membership Category: Premium");
    }else if(membershipTier.equals("VIP")){
        System.out.println("Membership Category: Luxury");
    }
    sc.close();
    
  }
}
