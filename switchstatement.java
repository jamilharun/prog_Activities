package Java.programmingactivities;
import java.util.Scanner;
public class switchstatement {
    public void switchprog() {
        Scanner add = new Scanner(System.in);
        System.out.println("please input number: ");
        int num = add.nextInt();
        switch (num) {
            case 1:
                System.out.println("Freshman");
                break;
            case 2:
                System.out.println("Sophomore");
                break;
            case 3:
                System.out.println("Junior");
                break;
            case 4:
                System.out.println("Senior");
                break;
            default:
                System.out.println("Out of School");
                break;
        }

    }
}
