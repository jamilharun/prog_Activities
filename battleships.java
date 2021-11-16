package Java.programmingactivities;
import java.util.Scanner;

public class battleships {
    public void ships() {

        Scanner input = new Scanner(System.in);
        
        System.out.println("enter your battle ship");
        System.out.println("B,C,D,F");
        String ship = input.next();
        
        System.out.println(ship);
        //if (ship == "b") {
          //  System.out.println("battleship");
        switch (ship) {
            case "b":
                System.out.println("battleship");
                break;
            case "B":
                System.out.println("battleship");
                break;
            case "C":
                System.out.println("cruiser");
                break;
            case "c":
                System.out.println("cruiser");
                break;
            case "D":
                System.out.println("destroyer");
                break;
            case "d":
                System.out.println("destroyer");
                break;
            case "f":
                System.out.println("frigate");
                break;
             case "F":
                System.out.println("frigate");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
