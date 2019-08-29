import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//public class Solution {
//    Calendar calendar;
//
//    public static Boolean flag;
//    static int B;
//    static int H;
//    static{
//        Scanner sc=new Scanner(System.in);
//        B=sc.nextInt();
//        H=sc.nextInt();
//        if(B>0&&H>0)
//            flag=true;
//        else{
//            flag=false;
//            try {
//                throw new Exception();
//            } catch (Exception e) {
//                System.out.println("java.lang.Exception: Breadth and height must be positive");
//            }
//        }
//
//    }
//
////Write your code here
//
//    public static void main(String[] args){
//        if(flag){
//            int area=B*H;
//            System.out.print(area);
//        }
//
//    }//end of main
//
//}//end of class
//
//
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int result=-1;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int ans=-1;
        int i=keyboards.length-1;
        int j=drives.length-1;
        while(i>=-0){
            if(keyboards[i]<b)
            {
                while(j>=0){
                    if(((keyboards[i]+drives[j])<b)&&(keyboards[i]+drives[j])>ans)
                        ans=keyboards[i]+drives[j];
                    else
                        j--; }

            }
            else
                i--;
            i--;
        }
        return ans;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

        bufferedWriter.write(String.valueOf(moneySpent));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
