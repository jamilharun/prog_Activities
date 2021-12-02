package Java.programmingactivities;
import java.util.Scanner;
public class tempeerature {
    public void tempunit() {
        Scanner add = new Scanner (System.in);
        System.out.println("please add a temperature unit");
        int temp = add.nextInt();
        if (temp <= 0) {
            System.out.println("ICE");
        }
        else if (temp < 100) {
        System.out.println("WATER");
        }
        else if (temp > 100){
                System.out.println("STREAM");
                }
        System.out.println("\n p2 \n");
        System.out.println("please name a aircraft");
        String aircraft = add.nextLine();
        System.out.println("please input speed/km'h");
        int kms = add.nextInt();
        System.out.println("please input lenth");
        int lenth = add.nextInt();
        if (kms > 1100) {
            System.out.println("its a civilian aircraft");
        }
        
        else if (kms < 500){
            System.out.println("its a military aircraft");
        }
        else {
            System.out.println("its a bird");
        }
        
        System.out.println("\n p3 \n");
        
        System.out.println(" to put a list of number in reverse");
        System.out.println("how many number do you wanna put?");
        int numbers = add.nextInt();
        int list1[] = new int[numbers]; 
        int list2[] = new int[numbers];
        int rinum =0;
        int numdup = numbers; 
        String print = " ";
        
        System.out.println("input your number list");
        for (int i =0; i < numbers ; i++) {
            list1[i] = add.nextInt();
            list2[i] = list1[i];
        }
        for (int i = numbers; i >= 0 ; i--) {
            rinum = i;
            rinum--;
            System.out.println(list1[rinum]);

        }
    }
}
