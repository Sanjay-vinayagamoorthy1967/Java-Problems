import java.util.Scanner;
public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cardTier = sc.next();
        String purchaseCategory = sc.next();
        Double transactionAmount  = sc.nextDouble();
        String promotionalStatus = sc.next();
        double BasePointsRate = 1.0;
        double CategoryBonus = 0;
        if(purchaseCategory.equals("Groceries")){
            CategoryBonus = 2.0;
        }else if(purchaseCategory.equals("Dining")){
            CategoryBonus = 2.5;
        }else if(purchaseCategory.equals("Travel")){
            CategoryBonus = 3.0;
        }else if(purchaseCategory.equals("Gas")){
            CategoryBonus = 2.0;
        }else if(purchaseCategory.equals("Other")){
            CategoryBonus = 1.0;
        }
        double TierMultiplier = 0;
        if(cardTier.equals("Basic")){
            TierMultiplier = 1.0;
        }else if(cardTier.equals("Gold")){
            TierMultiplier = 1.25;
        }else if(cardTier.equals("Platinum")){
            TierMultiplier = 1.5;
        }else if(cardTier.equals("Black")){
            TierMultiplier = 2.0;
        }
        double PromotionalMultiplier = 0;
        if(promotionalStatus.equals("None")){
            PromotionalMultiplier = 1.0;
        }else if(promotionalStatus.equals("Double-Points")){
            PromotionalMultiplier = 2.0;
        }else if(promotionalStatus.equals("Triple-Points")){
            PromotionalMultiplier = 3.0;
        }
        double pointsEarned = transactionAmount * BasePointsRate * CategoryBonus * TierMultiplier * PromotionalMultiplier;
        double Cashvalue = pointsEarned * 0.01;

        System.out.println("Card Tier: "+cardTier);
        System.out.println("Purchase Category: "+purchaseCategory);
        System.out.println("Transaction Amount: $"+transactionAmount);
        System.out.println("Promotional Status: "+promotionalStatus);
        System.out.println("Base Points Rate: "+BasePointsRate+" points per dollar");
        System.out.println("Category Bonus: "+CategoryBonus+"x");
        System.out.println(("Tier Multiplier: "+TierMultiplier+"x"));
        System.out.println("Promotional Multiplier: "+PromotionalMultiplier+"x");
        System.out.println("Points Earned: "+pointsEarned);
        System.out.printf("Equivalent Cash Value: $%.1f\n",Cashvalue);
        if(cardTier.equals("Basic")){
            System.out.println("Rewards Tier: Standard");
        }else if(cardTier.equals("Gold")){
            System.out.println("Rewards Tier: Enhanced");
        }else if(cardTier.equals("Platinum")){
            System.out.println("Rewards Tier: Premium");
        }else if(cardTier.equals("Black")){
            System.out.println("Rewards Tier: Elite");
        }      
       sc.close();
    }
}
