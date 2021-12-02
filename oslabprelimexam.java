package Java.programmingactivities;
import java.text.ParseException;
import java.util.Scanner;

public class oslabprelimexam {
    
    static void findTurnAroundTime(int processes[], int n,
            int burstTime[], int waitingTime[], int turnAroundTime[]) {
        for (int i = 0; i < n; i++) {
            turnAroundTime[i] = burstTime[i] + waitingTime[i];
        }
    }
 
    static void findavgTime(int processes[], int n, int burstTime[], int waitingTime[]) {
        //int waitingTime[] = new int[n], 
        int turnAroundTime[] = new int[n];
        int total_waitingTime = 0, total_turnAroundTime = 0;
 
                
        //findWaitingTime(processes, n, burstTime, waitingTime);
 
        findTurnAroundTime(processes, n, burstTime, waitingTime, turnAroundTime);
 
        System.out.printf("Processes Burst time Waiting"
                       +" time Turn around time\n");
 
        for (int i = 0; i < n; i++) {
            total_waitingTime = total_waitingTime + waitingTime[i];
            total_turnAroundTime = total_turnAroundTime + turnAroundTime[i];
            System.out.printf(" %d ", (i + 1));
            System.out.printf("     %d ", burstTime[i]);
            System.out.printf("          %d ", waitingTime[i]);
            System.out.printf("                 %d\n", turnAroundTime[i]);
        }
        float s = (float)total_waitingTime /(float) n;
        int t = total_turnAroundTime / n;
        System.out.printf("Average waiting time = %f", s);
        System.out.printf("\n");
        System.out.printf("Average turn around time = %d ", t);
    }
 
    
    public void oslabprelim() {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Jamil Harun L. Linzag\n" + "Ucos 2-1\n" + "Operating System");
        System.out.println("Sample output:Enter total number of processor (maximum of 20):");
        
        System.out.println("Please Enter a processer Number (1 - 25 only): \n");
        int numProcesses = scanner.nextInt();
        do {
            if (numProcesses > 25){
                System.out.println("oh no! you put num more than 25 \n Good bye!");
                System.exit(0);
            }
            break;
        } while (numProcesses < 25);
        
        int processes[] = new int[numProcesses];       
        int n = processes.length;      
        
        for (int i= 0; i < numProcesses; i++) {
            processes[i] = i;
        }
        
        System.out.println("Please enter a burst a burst time: \n");
        //int userInput = scanner.nextInt();
        int burstTime[] = new int[numProcesses];
        
        for (int i = 0; i < numProcesses; i++) {
            burstTime[i] = scanner.nextInt();
            //burstTime[i] = userInput;
        }
        
        /*for checking 
        for (int i =0; i < processes.length; i++) {
            System.out.println("prosses:: " + processes[i]);
            System.out.println("burstTime: " + burstTime[i] + "\n");
        }*/
        int waitingTime[] = {0,1,2,3,4};
        findavgTime(processes, n, burstTime, waitingTime);
    } 
}
