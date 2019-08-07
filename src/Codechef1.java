/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Codechef1 {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
            int  testcases=0;
            String  str=rd.readLine();
            if(str!=null)
                testcases=Integer.parseInt(str);
            while (testcases!=0){
                String[] boxes=rd.readLine().split(" ");
                System.out.println(check_Best(boxes));
                testcases--;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String check_Best(String[] boxes){
        int  n= 0;
        int k= 0;
        try {
            n = Integer.parseInt(boxes[0]);
            k = Integer.parseInt(boxes[1]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        if(n%(k*k)==0)
            return "NO";
        else
            return "YES";
    }
}

