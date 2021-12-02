package Java.programmingactivities;
import java.util.Scanner;
public class input4xny {
    public void input4xy() {
        Scanner add = new Scanner(System.in);
        int x;
        int y;
        String symbol;
        System.out.println("Please input for X");
        x = add.nextInt();
        
        System.out.println("Please input for Y");
        y = add.nextInt();
        
        System.out.println("Please input");
        symbol = add.next();
        
        if (symbol == "a") {
            int ans = x + y;
            System.out.println("a = " + ans);
        } else if (symbol == "m") {
            int ans = x * y;
            System.out.println("m = " + ans);
        }else if (symbol == "s") {
            int ans = x - y;
            System.out.println("s = " + ans);
        }else if (symbol == "d") {
            double ans = x / y;
            System.out.println("d = " + ans);
        }else if (symbol == "r") {
            double ans = x % y;
            System.out.println("r = " + ans);
        }else {
            System.out.println("invalid input");}
    }
}
