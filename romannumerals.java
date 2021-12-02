package Java.programmingactivities;
import java.util.Scanner;
public class romannumerals {
    public void converttoromanumerals() {
        Scanner inport = new Scanner(System.in);
        System.out.println("please add a number, not exceeding to 3000");
        int number = inport.nextInt();
        if (number > 3000) {
            System.out.println("the maximum num is 3000");
            System.exit(0);
        }
        String numerals = ""; 
        while (number > 0){ 
                if (number >= 1000) {
                        numerals += "M";
                        number -=1000;
                }
                else if(number >= 500) {
                        numerals += "D";
                        number -= 500;
                }
                else if(number >= 100) {
                        numerals += "C";
                        number -= 100;
                }
                else if(number >= 50) {
                        numerals += "L";
                        number -= 50;
                }
                else if(number >= 10) {
                        numerals += "X";
                        number -= 10;
                }
                else if(number >= 5) {
                        numerals += "V";
                        number -= 5;
                }
                else if(number >= 1) {
                        numerals += "I";
                        number -= 1;
                }
                
            }
        System.out.println("numerals = " + numerals); 
    
    }
}
