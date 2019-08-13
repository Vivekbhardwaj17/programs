import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main (String[] args)throws IOException
    {
        //code
        Scanner sc=new Scanner(System.in);
       // int testcases=sc.nextInt();
        int testcases=1;
        while(testcases!=0){
            int size=42;
            long[] arr={4,19,2,41,36,30,27,11,18,24,9,1, 34,14,40,23,20,25,22,1,33,15,31,21,5,8,37,29,7,12,32,39,6,34,3,10,26,17,13,42,38,35};

          // long pro=1;
           BigInteger pro =new BigInteger("1");
           for(int i=0;i<size;i++){
               // pro=pro*arr[i];
               pro=pro.multiply(BigInteger.valueOf(arr[i]));
            }
            //long  nwpro=1;
            BigInteger nwpro=new BigInteger("1") ;

            for(long i=1;i<=size;i++){
                nwpro=nwpro.multiply(BigInteger.valueOf(i));
               // nwpro=nwpro*i;
            }

            long  nwsum=0;
            for(int i=0;i<size;i++){
                nwsum+=arr[i];
            }
            BigInteger newsum=BigInteger.valueOf(nwsum);
            long sum=(size*(size+1))/2;
             BigInteger sumoriginal=BigInteger.valueOf(sum);
            long repeated= 0;
            long absent = 0;
            BigInteger nwpro_pro=nwpro.subtract(pro);
            if (!(nwpro.equals(pro))) {
                BigInteger subbig=sumoriginal.subtract(newsum);
                BigInteger divmultbig=pro.divide(nwpro_pro);

              BigInteger  repeatedvalue=(subbig.multiply(divmultbig));
               // repeated = ((sum-nwsum)*pro)/(nwpro-pro);
                repeated=repeatedvalue.longValue();
                BigInteger absentvalue=(repeatedvalue.multiply(nwpro)).divide(pro);
                absent=absentvalue.longValue();
               // absent = repeated*(nwpro)/(pro);
            }

            else{
                repeated=1;
                absent=sum-1;
            }
            System.out.println(repeated+" "+absent);
            testcases--;
        }

    }
}