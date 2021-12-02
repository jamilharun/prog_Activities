package Java.programmingactivities;
import java.util.Scanner;
public class age {
    public void myage() {
        Scanner add = new Scanner(System.in);
        System.out.println("your age = ");
        int age = add.nextInt();
        if (age > 81) {
            System.out.println("\n" + age);
            System.out.println(" out of range");
        }
        else if (age > 61) {
            System.out.println("\n" + age);
            System.out.println("Later Maturity");
        }
        else if (age > 36) {
             System.out.println("\n" + age);
             System.out.println("Middle Age");
        }
        else if (age > 18) {
             System.out.println("\n" + age);
             System.out.println("Early Adulthood");
        }
        else if (age > 13) {
            System.out.println("\n" + age);
            System.out.println("Adolescence");
        }
        else if (age > 6) {
            System.out.println("\n" + age);
            System.out.println("Middle ChildHood");
        }                       
        else if (age > 0) {
            System.out.println("\n" + age);
            System.out.println("Infancy and Early Childhood");
        }
        else {
            System.out.println("out of range");
        }
    }
}
