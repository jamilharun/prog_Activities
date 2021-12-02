package Java.programmingactivities;
import java.util.Scanner;
public class fibonacci {
    public void fobisequence() {
        Scanner input = new Scanner(System.in);
        System.out.println("number please for series of fibonacci: ");
        int i = 0;
        int number = input.nextInt();
        int y = 1;
        int x = 0;
        //System.out.println(x);
        int z = 0;
        //x = x + y;
        //System.out.println(x);
       // System.out.println(y);
       // z = x + y;
       // System.out.println(z);
       
        System.out.println("0");
        while (i <= number) {
            i = i + 3;
            x = y + z;
            y = x + z;
            z = x + y;
            System.out.println(x);
            System.out.println(y); 
            System.out.println(z);
            
        }

        System.out.println("\n\n\n");

        int count, num1 = 0, num2 = 1;

        System.out.print("Please enter how far the Fibonacci sequence will go: ");
        count = input.nextInt();
        while (i <= count) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
    
        }
    }
}
/*
this program has pretty ugly programming fomilization in it so.
it can be updated to better 
*/