package Java.programmingactivities;
import java.util.Scanner;
public class logarithmic {
    public void logarith() {
        Scanner valueIn = new Scanner(System.in);
        System.out.println("Name of the Experiment:\n" +
"1. Create a java program that will accept two numbers whose value is 2 and 3 and display their product, quotient, modulus, sum and difference. \n\n\n\n");
        
        System.out.println("Please input 2 numbers. \n");
        int value1 = valueIn.nextInt();
        int value2 = valueIn.nextInt();
        
        int product = value1 * value2;
        int quotient = value1 / value2;
        int sum = value1 + value2;
        int difference = value1 - value2;
        
        System.out.println("first input: " + value1);
        System.out.println("Second input: " + value2);
        System.out.println("the product: " + product);
        System.out.println("the quotient: " + quotient);
        System.out.println("the sum:" + sum);
        System.out.println("the difference:" + difference);
    }
}
