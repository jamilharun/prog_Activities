package Java.programmingactivities;

public class interest {
    public void exactordinary() {
        System.out.println(" Design a program in Java NetBeans that find the ordinary and exact interest at 5% on 5,000 "
                + "Philippine peso of 29 days. Consider the following formula to get the final answer:\n" +
                "Exact Interest: 365/days*interest Ordinary Interest: 360/days*interest \n");
        
        double exactInterest = 4000 * .07 * 29 / 365; 
        double ordinaryInterest = 4000 * .07 * 29 / 360;
        
        System.out.println("The Exact Interest: \n" + exactInterest + "\n");
        System.out.println("The Ordinary Interest \n" + ordinaryInterest);
    }
}
