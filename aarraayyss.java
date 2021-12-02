package Java.programmingactivities;
import java.util.Scanner;
import java.util.Arrays;


public class aarraayyss {
    public void aarraayyss() {
        Scanner input = new Scanner(System.in);
    
        int size = 0;
        double sum = 0;
            try {
                System.out.println("Enter Array size ");
                size = input.nextInt();
              
            } 
            catch (Exception e) {
                System.out.println("Error!");
            }
           
      
        int array[] = new int[size];
        for (int i=0;i < array.length; i++) {
            System.out.println("for Slot ["+i+"]");
            try {
                array[i] = input.nextInt();
            }
            catch (Exception e) {
                System.out.println("error");
            }
        }
        int n = array.length;  
       
        try {
            for (int i=0; i<n; i++) {
            sum += array[i]; 
        }
        }
        catch (Exception e){
            System.out.println("error happen in array sum");
        }
    
        int arrsec[] = new int[n];
        try {
        
        for (int i = 0; i<n;i++) {
            arrsec[i] = array[i]; 
        }
        }
        catch (Exception e) {
            System.out.println("error in array copy");
        }
        Arrays.sort(arrsec);
        System.out.println("The max number in array elements is: "+ arrsec[n]);
        System.out.println("The min number in array elements is: " + arrsec[0]);
        System.out.println("sum of array: "+ sum/n);
        System.out.println("The average of array elements is:"+ sum/2);
    }
}