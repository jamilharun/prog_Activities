package Java.programmingactivities;
import java.util.Scanner;
public class grades {
    public void mygrades() {
        Scanner add = new Scanner(System.in);
        System.out.println("Hello im here to compute your grade \n but first tell me your name? \n");
        String name = add.nextLine();
        System.out.println("your middle initial?");
        String middleInitial = add.nextLine();
        System.out.println("your last name?");
        String lastname = add.nextLine();
        System.out.println("what is your section");
        String section = add.nextLine();
        
        System.out.println("Please input your prelim grades");
        double prelim = add.nextDouble();
        System.out.println("Please input your Midterm grades");
        double midterm = add.nextDouble();
        System.out.println("please input your Finals Grades");
        double finals = add.nextDouble();
        System.out.println("please input your activities grades");
        double activities = add.nextDouble();
        
        System.out.println("FullName: " + name + lastname + middleInitial);
        System.out.println("Year and section: " + section);
        System.out.println("Prelims: " + prelim);
        System.out.println("Midterm: " + midterm);
        System.out.println("Finals: " + finals);

        double grades = (prelim + midterm + finals + activities) / 4;
        
        System.out.println("Grade" + grades);
        
        if (grades >= 99) {           
            System.out.println("Grade equivalent: 1.00");
            System.out.println("Remarks: Passed");
        }
        else if (grades >= 97) {
            System.out.println("Grade equivalent: 1.25");
            System.out.println("Remarks: Passed");
        }
        else if (grades >= 94) {
            System.out.println("Grade equivalent: 1.50");
            System.out.println("Remarks: Passed");
        }
        else if (grades >= 91) {
            System.out.println("Grade equivalent: 1.75");
            System.out.println("Remarks: Passed");
        }
        else if (grades >= 87) {
            System.out.println("Grade equivalent: 2.00");
            System.out.println("Remarks: Passed");
        }
        else if (grades >= 83) {
            System.out.println("Grade equivalent: 2.25");
            System.out.println("Remarks: Passed");
        }
        else if (grades >= 80) {
            System.out.println("Grade equivalent: 2.50");
            System.out.println("Remarks: Passed");
        }
        else if (grades >= 76) {            
            System.out.println("Grade equivalent: 2.75");
            System.out.println("Remarks: Passed");
        }
        else if (grades >= 75) {
            System.out.println("Grade equivalent: 3.00");
            System.out.println("Remarks: Passed");
        }     
        else {
            System.out.println("Grade equivalent: 5.00");
            System.out.println("Remarks: failed");
        }
    }
}
