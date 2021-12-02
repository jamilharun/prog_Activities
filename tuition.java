package Java.programmingactivities;
import java.util.Scanner;
public class tuition {
    public void tuitionfee() {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Please input your tuition fee =");
        int tuitionFee = input.nextInt();
        //int money = input.nextInt();
    
        System.out.println("Enter 1 for Cash,\n 2 for Two-Installment,\n 3 for Three-Installment \n");
        int choices = input.nextInt();
        switch (choices){
            case 1:
                System.out.println("result = " + (tuitionFee - (tuitionFee * .10)));
                break;
            case 2:
                System.out.println("two-Installmant = " + (tuitionFee - (tuitionFee * .05)));
                break;
            case 3:
                System.out.println("Three-installment = " + (tuitionFee - (tuitionFee * .10)));
                break;      
        }
    }
}
