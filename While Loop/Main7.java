import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        boolean state = true;
        do{
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        if(choice==5){
            state = false;
            System.out.println("Good Byee..!");
            break;
        }
        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result =0;
        switch(choice){
            case 1:
                result = a + b;
                System.out.println("Result: "+result);
                break;
            
            case 2:
                result = a - b;
                System.out.println("Result: "+result);
                break;
            
            case 3:
                result = a * b;
                System.out.println("Result: "+result);
                break;
            
            case 4:
                result = a / b;
                System.out.println("Result: "+result);
                break;
               
        } 
    }while(state); 
        sc.close();      
    }
}
