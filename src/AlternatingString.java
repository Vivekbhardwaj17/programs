import java.util.*;
import java.lang.*;
import java.io.*;
class AlternatingString
{
    public static void main (String[] args)throws IOException
    {
        //code
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int testcase=Integer.parseInt(sc.readLine());
        while(testcase!=0){
            String str=sc.readLine();
            char[] arr=str.toCharArray();
            int count=0;
            int loopcount=-1;
            int i=0;
            int j=str.length()-1;
            int swapstart=-1;
            int swapend=-1;
            while(loopcount==-1){
                while(swapstart==-1&&i<str.length()){

                    if((i%2)==Character.getNumericValue(arr[i])){
                        i++;
                    }
                    else {
                        swapstart=i;
                    }
                }
                if(i==str.length()||j==-1){
                    System.out.println(count);
                    loopcount=1;
                    break;
                }
                while(swapend==-1&&j>=0){
                    if(j%2==Character.getNumericValue(arr[j])){
                        j--;
                    }
                    else{
                        swapend=j;
                    }
                }
                if(swapend!=-1&&swapstart!=-1){
                    int local=arr[swapend];
                    arr[swapend]=arr[swapstart];
                    arr[swapstart]=arr[swapend];
                    count++;
                    swapend=-1;
                    swapstart=-1;i++;j--;
                }
                if(i==str.length()||j==-1){
                    System.out.println(count);
                    loopcount=1;
                }

            }

            testcase--;
        }

    }
}
