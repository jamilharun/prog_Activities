package Java.programmingactivities;

import java.util.Scanner;

public class vote {
    public void votersage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a java program using if-else conditional statements that determines if the \n          input age is qualified to vote or not. The qualifying age is 18 years old and above. ");
        System.out.println("please input age = \n");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("you are allowed  to vote");
        }else if (age <= 17) {
            System.out.println("you are too young to vote");
        }else{
            System.out.println("input invalid");
        }
    }
}
