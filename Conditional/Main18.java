import java.util.Scanner;
public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double packageWeight = sc.nextDouble();
        String destinationZone = sc.next();
        String shippingSpeed = sc.next();
        String packageSize = sc.next();
        double BaseShippingRate = 0;
        if(shippingSpeed.equals("Economy")){
            BaseShippingRate = 5;
        }else if(shippingSpeed.equals("Standard")){
            BaseShippingRate = 10;
        }else if(shippingSpeed.equals("Express")){
            BaseShippingRate = 25;
        }else if(shippingSpeed.equals("Overnight")){
            BaseShippingRate = 50;
        }
        double WeightSurcharge = packageWeight*1;
        double ZoneMultiplier = 0;
        if(destinationZone.equals("Local")){
            ZoneMultiplier = 1.0;
        }else if(destinationZone.equals("Regional")){
            ZoneMultiplier = 1.2;
        }else if(destinationZone.equals("National")){
            ZoneMultiplier = 1.5;
        }else if(destinationZone.equals("International")){
            ZoneMultiplier = 3.0;
        }
        double SizeSurcharge = 0;
        if(packageSize.equals("Small")){
            SizeSurcharge = 0;
        }else if(packageSize.equals("Medium")){
            SizeSurcharge = 5;
        }else if(packageSize.equals("Large")){
            SizeSurcharge = 15;
        }else if(packageSize.equals("Oversized")){
            SizeSurcharge = 30;
        }
        double baseCost = (BaseShippingRate + WeightSurcharge) * ZoneMultiplier;
        double totalCost = baseCost + SizeSurcharge;
        int EstimatedDelivery = 0;
        if(shippingSpeed.equals("Economy")){
            if(destinationZone.equals("Local")){
                EstimatedDelivery = 5;
            }else if(destinationZone.equals("Regional")){
                EstimatedDelivery = 7;
            }else if(destinationZone.equals("National")){
                EstimatedDelivery = 10;
            }else if(destinationZone.equals("International")){
                EstimatedDelivery = 21;
            }
        }
        if(shippingSpeed.equals("Standard")){
            if(destinationZone.equals("Local")){
                EstimatedDelivery = 3;
            }else if(destinationZone.equals("Regional")){
                EstimatedDelivery = 5;
            }else if(destinationZone.equals("National")){
                EstimatedDelivery = 7;
            }else if(destinationZone.equals("International")){
                EstimatedDelivery = 10;
            }
        }
        if(shippingSpeed.equals("Express")){
            if(destinationZone.equals("Local")){
                EstimatedDelivery = 1;
            }else if(destinationZone.equals("Regional")){
                EstimatedDelivery = 2;
            }else if(destinationZone.equals("National")){
                EstimatedDelivery = 2;
            }else if(destinationZone.equals("International")){
                EstimatedDelivery = 3;
            }
        }
        if(shippingSpeed.equals("Overnight")){
            EstimatedDelivery = 1;
        }
        System.out.println("Package Weight: "+packageWeight);
        System.out.println("Destination Zone: "+destinationZone);
        System.out.println("Shipping Speed: "+shippingSpeed);
        System.out.println("Package Size: "+packageSize);
        System.out.println("Base Shipping Rate: $"+BaseShippingRate);
        System.out.println("Weight Surcharge: $"+WeightSurcharge);
        System.out.println("Zone Multiplier: "+ZoneMultiplier+"x");
        System.out.println("Size Surcharge: $"+SizeSurcharge);
        System.out.printf("Total Shipping Cost: $%.1f\n",totalCost);
        System.out.println("Estimated Delivery: "+EstimatedDelivery+" business days");
        if(shippingSpeed.equals("Express")){
            System.out.println("Service Level: Priority");
        }else if(shippingSpeed.equals("Standard")){
            System.out.println("Service Level: Standard");
        }else if(shippingSpeed.equals("Overnight")){
            System.out.println("Service Level: Premium");
        }else if(shippingSpeed.equals("Economy")){
            System.out.println("Service Level: Budget");
        }
           sc.close();
    }
}
