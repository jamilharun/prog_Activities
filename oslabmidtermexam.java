package Java.programmingactivities;
import java.util.Scanner;
import java.text.ParseException;
public class oslabmidtermexam {
    static void gettingExitTime (int burstTime[], int qT, int exitTime[], int numberProcesses) {
        int dupBT[] = new int[numberProcesses];
        for (int i=0; i < numberProcesses; i++) {
            dupBT[i] = burstTime[i]; 
        }
        int etc = 0;
        System.out.println("\t[ExTiCount][exit Time Array][Burst time]");
        while (true) {
            boolean finish = true;
            for (int i=0; i < numberProcesses; i++) {
                if (dupBT[i] > 0){
                    finish = false;
                    
                    if (dupBT[i] > qT) {
                        etc += qT; 
                        exitTime[i] = etc;
                        dupBT[i] -= qT; 
                        System.out.println("P["+i+"]\t[" +etc + "]\t\t[[" + exitTime[i] + "]]\t\t[" + dupBT[i]+"]");
                    }
                    else{
                        System.out.println("Else Sequence=================================");
                        dupBT[i] -= qT; 
                        
                        etc += qT; 
                        etc += dupBT[i];
                        int stop = etc; 
                        exitTime[i] =  stop;
                        System.out.println("P["+i+"]\t[" +etc + "]\t\t[[" + exitTime[i] + "]]\t\t[" + dupBT[i]+"]");
                        dupBT[i] = 0;
                        System.out.println("PE["+i+"]"+"\t[" +etc + "]["+ stop + "]\t\t[[" + exitTime[i] + "]]\t\t[" + dupBT[i]+"]");
                    }
                }
            }
            if (finish == true) {
                break;
            }
        }
    }
    static void gettingTurnAroundTime (int exitTime[], int arrivalTime[] ,int numberProcesses, int turnAroundTime[]) {
        for (int i=0; i< numberProcesses; i++ ) {
            turnAroundTime[i] = exitTime[i] - arrivalTime[i];
        }
    }
    static void gettingWaitingTime (int waitingTime[], int turnAroundTime[], int burstTime[], int numberProcesses) {
        for (int i=0; i< numberProcesses; i++ ) {
            waitingTime[i] = turnAroundTime[i] - burstTime[i];
        }
    }
    static void printing (int arrivalTime[], int burstTime[], int qT, int turnAroundTime[], int waitingTime[], int exitTime[],int numberProcesses) {
       
        gettingExitTime(burstTime,qT,exitTime,numberProcesses);
        gettingTurnAroundTime(exitTime,arrivalTime,numberProcesses, turnAroundTime);
        gettingWaitingTime(waitingTime,turnAroundTime,burstTime,numberProcesses);
       
        double aveTurnAroundTime = 0;
        double aveWaitingTime = 0;
        
        System.out.println("Proce|"+"|Arrival time|" + "|Burst time|" + "|Waiting time|" + "\t|turn around time|");
      
        
        for (int i = 0; i < numberProcesses; i++) {
            aveTurnAroundTime = aveTurnAroundTime + turnAroundTime[i];
            aveWaitingTime = aveWaitingTime + waitingTime[i];
            System.out.println("P[" + (i+1)+ "]\t[" + arrivalTime[i] + "]\t\t[" + burstTime[i] + "]\t" + 
                    turnAroundTime[i]+"-"+burstTime[i]+"=\t ["+ waitingTime[i]+"]\t" + 
                    +exitTime[i]+"-"+arrivalTime[i]+"= \t["+turnAroundTime[i]+"]");
        }
        System.out.println("Average turn around time = " + aveTurnAroundTime + "/" + numberProcesses + "= [" + aveTurnAroundTime / numberProcesses+"]");
        System.out.println("Average waiting time = " +aveWaitingTime + "/" + numberProcesses + "= ["+aveWaitingTime / numberProcesses+"]");
    }
    
    
    public void roundrobin() {
        Scanner add = new Scanner(System.in);
        System.out.println("==/Round Robin/==");
        System.out.println("Please input a number for Processors = ");
        int numberProcesses = add.nextInt(); 
        int arrivalTime[] = new int[numberProcesses]; 
        System.out.println("Please input for arrival time");
        for (int i = 0; i < numberProcesses; i++) {
           
            arrivalTime[i] = add.nextInt();
      
        }
      
        
        int burstTime[] = new int[numberProcesses]; 
        System.out.println("Please input for burst time");
        for (int i = 0; i < numberProcesses; i++) {
            burstTime[i] = add.nextInt();
        }
        int waitingTime[] = new int[numberProcesses];
        int turnAroundTime[] = new int[numberProcesses];
        int exitTime[] = new int[numberProcesses];
        System.out.println("Please input for Quantum");
        int qT = add.nextInt();
      
        printing(arrivalTime, burstTime, qT, exitTime, waitingTime, turnAroundTime, numberProcesses);
    }
}
