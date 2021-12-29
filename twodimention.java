package Java.programmingactivities;
import java.util.Scanner;

public class twodimention {
    public void twodim() {
        Scanner in = new Scanner(System.in);
        System.out.println("==============2D Array===================");
        System.out.println("\nplease input for rows and collums");
        int x = in.nextInt(); // x = 4
        int y = in.nextInt(); // y = 3
        
        //test
        //System.out.println("value of x.length: " + x + " hmmm " + y); 

        System.out.println("\nyour table has " + x + " row's and " + y + " collum's");
        
        int twodim[][] = new int[x][y];

        //test value
        //System.out.println("value of x.length: " + twodim[x].length + twodim[y].length);
        
        //int forx=x-1, fory=y-1;
        
        //try{

        for(int i=0; i < x; i++){ //inputting values __ twodim[x].length = 4
            for(int j=0; j < y;j++){
                System.out.println("loop checker: "+i+"<"+x+"\t"+j+"<"+y);




                System.out.println("please input for: " + (i+1) + ":" + (j+1));
                twodim[i][j] = in.nextInt();
                //  11  12
                //  21  22
                //  31  32
            }
            System.out.println();
        }
        //}
        /*}catch(Exception e) {
            int ydup = y - 1;
            twodim[ydup][x]
        }*/
        System.out.println("YOUR TABLE:");
        for(int i=0; i < x;i++){
            for(int j=0; j < y; j++){
                System.out.print(twodim[i][j]+"\t");
            }
            System.out.println();
        }
        int sum[] = new int[x];
        for(int i=0;i < x;i++){ //getting sum of every row
            for(int j=0 ; j < y;j++){ 
                sum[i] += twodim[i][j];
            }
        }
        //for correction
        for (int i=0; i < x; i++){
            System.out.println("________________");
            System.out.println(sum[i] + "\t");
        }
        for(int i=0; i < x;i++){ //getting average
            //for(int j=0; j < y; j++){
                //System.out.println("print x:" + x );
                System.out.println("Ave_row "+ (i+1) + ": "+ (double)sum[i]/x);
            //}
        }
    }
}
