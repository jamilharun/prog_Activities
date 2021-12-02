package Java.programmingactivities;
import java.util.Scanner;

public class numbersOnly {
    public void numbersonly() {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Please type a number(maximum 3000): ");
        int n = scanner.nextInt();
        if (n >3000) {
		System.out.print("INVALID INPUT!");
	   } else {
		System.out.print("Number in words: " + NumberToWord(n));
	 }
	scanner.close();
    }
	private static String NumberToWord(int number) { 
        String words = "";
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                      "seven", "eight", "nine", "ten", "eleven", "twelve",
                      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                      "eighteen", "nineteen" };
	String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                      "sixty", "seventy", "eighty", "ninety" };
        
	if (number == 0) {
	    return "zero";
	}if (number < 0) {    
           String numberStr = "" + number;  
           numberStr = numberStr.substring(1); 
           return "minus " + NumberToWord(Integer.parseInt(numberStr));        
    }if ((number / 1000000) > 0) {
	   words += NumberToWord(number / 1000000) + " million ";
	   number %= 1000000;
	}if ((number / 1000) > 0) {
	    words += NumberToWord(number / 1000) + " thousand ";
	    number %= 1000;
	}if ((number / 100) > 0) {
	     words += NumberToWord(number / 100) + " hundred ";
	     number %= 100;
	}if (number > 0) {
	    if (number < 20) {                  
                    words += unitsArray[number];
            } else { 
                words += tensArray[number / 10]; 
                if ((number % 10) > 0) {
		    words += "-" + unitsArray[number % 10];
                }  
	    	}
        }
	  return words;

      }
}
