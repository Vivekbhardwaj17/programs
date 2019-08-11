import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestGeeks {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
       // String str1 = rd.readLine();
      //  int testcases = Integer.parseInt(str1);
int testcases=1;
        while (testcases != 0) {
           // String str2 = rd.readLine();
            String str2="DDIDDIID";
            int star_swapping = -1;
            int len = str2.length();
            String[] values = str2.split("");
            int number[] = new int[len+1];
            for (int i = 0; i < len+1; i++) {//my array
                number[i] = i + 1;
            }
            for (int i = 0; i < len; i++) {
                if (values[i].equals("I")) {
                    if (star_swapping == -1) {
                        continue;
                    } else {
                        swap(number, star_swapping, i);
                        star_swapping = -1;
                    }
                } else {
                    if (star_swapping == -1)
                        star_swapping = i;
                }
            }
            if (star_swapping != -1) {
                swap(number, star_swapping, len );
            }

            for (int i = 0; i < len+1; i++) {
                System.out.print(number[i]);

            }
            System.out.println();
            testcases--;
        }
    }
        public static void swap(int a[],int intial,int final1){
            while(intial<final1){
                int local=a[intial];
                a[intial]=a[final1];
                a[final1]=local;
                        intial++;
                final1--;
            }
        }

}

