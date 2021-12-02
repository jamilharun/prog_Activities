package Java.programmingactivities;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class dollartopeso {
    public void dol2pesoconverter() throws Exception {
        System.out.println("Please input amounth of US money \n");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        
        int usd = Integer.parseInt(br.readLine());
       
        System.out.println("usd : \n" + usd);
        double inverseConvertion = usd / 0.0205804;
        System.out.println("Money converted = \n" + inverseConvertion);
    }
}
