package Java.programmingactivities;
import java.util.Scanner;


public class earthQuake {
    public void magnetude() {
        Scanner oof = new Scanner(System.in);
        double ow = oof.nextDouble();
         System.out.println(ow);
        if (ow < 5.0) {
            System.out.println("little no damage");
        }
        else if (ow > 5.0 || ow < 5.5) {
            System.out.println("Some damage");
        }
        else if (ow > 5.6 || ow < 6.5) {
            System.out.println("Some damage");
        }
        else if (ow > 6.6 || ow < 7.5) {
            System.out.println("Some damage");
        }
        else {
            System.out.println("huhu");
        }
    }
    
}
