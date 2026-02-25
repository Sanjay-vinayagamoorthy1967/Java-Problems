import java.util.Scanner;
public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storageGB = sc.nextInt();
        int userCount = sc.nextInt();
        String backupFrequency = sc.next();
        String supportTier = sc.next();
        double BaseStorageCost = 0;
        if(storageGB>=10 && storageGB<=100){
            BaseStorageCost = storageGB*0.05;
        }else if(storageGB>=101 && storageGB<=500){
            BaseStorageCost = (storageGB*0.04)+5;
        }else if(storageGB>=501 && storageGB<=2000){
            int sum = storageGB-500;
            BaseStorageCost = (sum*0.03)+25;
        }else if(storageGB>=2001){
            int sum = storageGB-2000;
            BaseStorageCost = (sum*0.02)+140;
        }
        double PerUserFee = 0;
        if(userCount>=1 && userCount<=10){
            PerUserFee =userCount*5;
        }else if(userCount>=11 && userCount<=50){
            PerUserFee =userCount*4;
        }else if(userCount>=51){
            PerUserFee =userCount*3+100;
        }
        double BackupPremium = 0;
        if(backupFrequency.equals("Daily")){
            BackupPremium = userCount*0;
        }else if(backupFrequency.equals("Hourly")){
            BackupPremium = userCount*0.50+10;
        }else if(backupFrequency.equals("Real-Time")){
            BackupPremium = userCount*1;
        }
        double SupportFee = 0;
        if(supportTier.equals("Community")){
            SupportFee = 0;
        }else if(supportTier.equals("Standard")){
            SupportFee = 20;
        }else if(supportTier.equals("Priority")){
            SupportFee = 75;
        }else if(supportTier.equals("Enterprise")){
            SupportFee = 200;
        }
        double Monthlytotal = BaseStorageCost + PerUserFee + BackupPremium + SupportFee;
        double Annual = Monthlytotal * 12 * 0.9;
        System.out.println("Storage Capacity: "+storageGB);
        System.out.println("User Count: "+userCount);
        System.out.println("Backup Frequency: "+backupFrequency);
        System.out.println("Support Tier: "+supportTier);
        System.out.println("Base Storage Cost: $"+BaseStorageCost);
        System.out.println("Per-User Fee: $"+PerUserFee);
        System.out.println("Backup Premium: $"+BackupPremium);
        System.out.println("Support Fee: $"+SupportFee);
        System.out.println("Monthly Subscription: $"+Monthlytotal);
        System.out.println("Annual Subscription: $"+Annual+" (save 10%)");
        
        int count = 0;
        if(userCount==1){
            System.out.println("Recommended Plan: Personal");
            count=1;
        }else if(userCount>=2 && userCount<=20){
            System.out.println("Recommended Plan: Team");
            count=2;
        }else if(userCount>=21 && userCount<=100){
            System.out.println("Recommended Plan: Business");
            count=3;
        }else if(userCount>100){
            System.out.println("Recommended Plan: Enterprise");
            count=4;
        }
        
        if(count==1){
            System.out.println("Included Features: Basic storage, file sync");
        }else if(count==2){
            System.out.println("Included Features: Version history, file sharing, basic analytics");
        }else if(count==3){
            System.out.println("Included Features: Advanced sharing, team analytics, priority support");
        }else if(count==4){
            System.out.println("Included Features: Advanced security, compliance tools, dedicated support, API access");
        }
        
        sc.close();
        
    }
}