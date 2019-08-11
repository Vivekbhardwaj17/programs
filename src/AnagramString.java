import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class AnagramString {
    public static void main(String[] args) throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        String str1=rd.readLine();
        boolean response=true;
        int testcases=Integer.parseInt(str1);
        while(testcases!=0){

            String []fullString=rd.readLine().split(" ");
            char stringArray[]=fullString[0].toCharArray();

            char string2Array[]=fullString[1].toCharArray();
            int []freq=new int[26];

            if (string2Array.length==stringArray.length) {
                for (int i = 0; i <stringArray.length ; i++) {
                    freq[stringArray[i]-97]++;
                }
                for (int i = 0; i <string2Array.length ; i++) {
                    freq[string2Array[i]-97]--;
                }
                for (int i = 0; i <26 ; i++) {
                    if(freq[i]!=0){
                        System.out.print("NO");
                    response=false;}
                }
                if(response){
                    System.out.print("YES");
                }
            }
            else
                System.out.print("NO");
            System.out.println();
            testcases--;
        }
    }
}
