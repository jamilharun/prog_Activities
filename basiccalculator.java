package Java.programmingactivities;
import java.util.Scanner;
public class basiccalculator {
    public void basiccal() {
        double ans = 0;
        Scanner scan = new Scanner (System.in);
        System.out.print("Please enter the first Integer(x)> ");
        int x = scan.nextInt();
        System.out.print("Please enter the second Integer(y)> ");
        int y = scan.nextInt();
        System.out.print("Please enter the a letter for Computation> ");
        String ch = scan.next();
        
        switch (ch){
            case "a":
                ans = x + y;
                System.out.print(x + " + " + y + " = " + ans);
                break;
            case "m":
                ans = x * y;
                System.out.print(x + " * " + y + " = " + ans);
                break;
            case "s":
                ans = x - y;
                System.out.print(x + " - " + y + " = " + ans);
                break;            
            case "d":
                ans = x / y;
                System.out.print(x + " / " + y + " = " + ans);
                break;    
            case "r":
                ans = x % y;
                System.out.print(x + " % " + y + " = " + ans);
                break;
            default:
                System.out.print("Error!");
        }
    }
}
