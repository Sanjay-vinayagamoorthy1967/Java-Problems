import java.util.Scanner;
public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stockPercentage = sc.nextInt();
        int investmentYears = sc.nextInt();
        String riskTolerance = sc.next();
        String marketVolatility = sc.next();
        int BondAllocation = 100-stockPercentage;
        int PortfolioRiskScore = stockPercentage;
        if(investmentYears>=1 && investmentYears<=5){
            if(stockPercentage>50){
                PortfolioRiskScore += 20;
            }
        }else if(investmentYears>=6 && investmentYears<=10){
            if(stockPercentage>60){
                PortfolioRiskScore += 10;
            }
        }else if(investmentYears>=11 && investmentYears<=20){
            if(stockPercentage>80){
                PortfolioRiskScore += 5;
            }
        }
        if(marketVolatility.equals("Medium")){
            PortfolioRiskScore += 10;
        }else if(marketVolatility.equals("High")){
            PortfolioRiskScore += 20;
        }

        if(PortfolioRiskScore>100){
            PortfolioRiskScore = 100;
        }
        System.out.println("Stock Allocation: "+stockPercentage+"%");
        System.out.println("Bond Allocation: "+BondAllocation+"%");
        System.out.println("Investment Horizon: "+investmentYears+" years");
        System.out.println("Risk Tolerance: "+riskTolerance);
        System.out.println("Market Volatility: "+marketVolatility);
        System.out.println("Portfolio Risk Score: "+PortfolioRiskScore+"/100");
        int count=0;
        if(stockPercentage>=0 && stockPercentage<=30){
            System.out.println("Risk Category: Low");
            count=1;
        }else if(stockPercentage>=31 && stockPercentage<=60){
            System.out.println("Risk Category: Moderate");
            count = 2;
        }else if(stockPercentage>=61 && stockPercentage<=80){
            System.out.println("Risk Category: High");
            count = 3;
        }else if(stockPercentage>=81 && stockPercentage<=100){
            System.out.println("Risk Category: Very High");
            count=4;
        }
        int total = 0;
        if(riskTolerance.equals("Conservative")){
            if(count==1){
                System.out.println("Alignment Status: Well Aligned");
                total =1;
            }else if(count==2){
                System.out.println("Alignment Status: Acceptable");
                total =2;
            }else if(count==3){
                System.out.println("Alignment Status: Misaligned");
                total =3;
            }else if(count==4){
                System.out.println("Alignment Status: Misaligned");
                total =3;
            }
        }
        if(riskTolerance.equals("Moderate")){
            if(count==1){
                System.out.println("Alignment Status: Acceptable");
                total=2;
            }else if(count==2){
                System.out.println("Alignment Status: Well Aligned");
                total =1;
            }else if(count==3){
                System.out.println("Alignment Status: Acceptable");
                total =2;
            }else if(count==4){
                System.out.println("Alignment Status: Misaligned");
                total =3;
            }
        }
         if(riskTolerance.equals("Aggressive")){
            if(count==1){
                System.out.println("Alignment Status: Misaligned");
                total =3;
            }else if(count==2){
                System.out.println("Alignment Status: Acceptable");
                total=2;
            }else if(count==3){
                System.out.println("Alignment Status: Well Aligned");
                total=1;
            }else if(count==4){
                System.out.println("Alignment Status: Well Aligned");
                total=1;
            }
        }
        if(total==1){
            System.out.println("Recommendation: Portfolio is appropriately balanced for your profile");
            System.out.println("Suggested Rebalancing: No action needed");
        }else if(total==2){
            System.out.println("Recommendation: High risk level acceptable given long horizon and tolerance");
            System.out.println("Suggested Rebalancing: Monitor closely, consider slight reduction if volatility persists");
        }else if(total==3){
            System.out.println("Recommendation: Portfolio is too conservative for your risk tolerance");
            System.out.println("Suggested Rebalancing: Increase stocks to 80-90% for better growth potential");
        }
       sc.close();
    }
}
