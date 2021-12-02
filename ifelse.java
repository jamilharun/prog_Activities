package Java.programmingactivities;
import java.util.Scanner;
import java.util.*;
public class ifelse {
    public void ifstatement() {
        Scanner input = new Scanner(System.in);
        System.out.println("please input number: ");
        String number = "";
        number = input.next();
        char[] ch = new char[number.length()];
        for (int i =0; i < number.length(); i++) {
            ch[i] = number.charAt(i);
        }
        for (char c: ch) {
            if (c == '0') {
                System.out.println("X");
            }
            else if (c == '1') {
                System.out.println("C");
            }
            else if (c == '2') {
                System.out.println("O");
            }
            else if (c == '3') {
                System.out.println("M");
            }
            else if (c == '4') {
                System.out.println("P");
            }
            else if (c == '5') {
                System.out.println("U");
            }
            else if (c == '6') {
                System.out.println("T");
            }
            else if (c == '7') {
                System.out.println("E");
            }
            else if (c == '8') {
                System.out.println("R");
            }
            else if (c == '9') {
                System.out.println("S");
            }
            else {
                System.out.println(c);
            }
        }
    }
}
