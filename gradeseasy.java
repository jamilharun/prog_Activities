package Java.programmingactivities;
import java.util.Scanner;

public class gradeseasy {
    public void gradeidentifier() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your grades: \n");
        int grades = scan.nextInt();
        if (grades < 60) {
            System.out.println("F");
        }
        else if (grades < 69) {
            System.out.println("D");
       }
        else if (grades < 79) {
            System.out.println("C");
        }
        else if (grades < 89) {
            System.out.println("B");
        }
        else if (grades >= 90) {
            System.out.println("A");
        }
        else {
            System.out.println(" ");
        }
    }
}
