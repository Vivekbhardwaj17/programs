import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AsianPaints  {
    public static void main(String[] args) throws IOException {


        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String str;



                str = rd.readLine();

            int count = 0;
            String[] timeperiods = str.split(" ");
                  Arrays.sort(timeperiods);
            for (int i = timeperiods.length-1; i > 0; i--) {
                count = count + Integer.parseInt(timeperiods[i]);
            }
            count = count + (Integer.parseInt(timeperiods[0]) * (timeperiods.length - 2));
            System.out.println(count);



    }
}
