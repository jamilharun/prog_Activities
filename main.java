package Java.programmingactivities;
import java.util.Scanner;
public class main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("this is the main class for programming activities");
        System.out.println("1 - battleships");
        System.out.println("2 - EarthQuake");
        int accts = input.nextInt();
        switch (accts) {
            case 1 :
            battleships battleshipsObject = new battleships();
            battleshipsObject.ships();
            break;

            case 2:
            earthQuake earthQuakeObject = new earthQuake();
            earthQuakeObject.magnetude();
            break;

            case 3:
            numbersOnly numbersOnlyObject = new numbersOnly();
            numbersOnlyObject.numbersonly();
            break;

            case 4:
            damage damageObject = new damage();
            damageObject.damagerate();
            break;

            default:
            System.out.println("invalid input");
            break;
        }
        
    System.exit(0);
    }
}
