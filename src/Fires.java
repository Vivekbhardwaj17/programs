import java.io.BufferedReader;

/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.io.*;
import java.util.*;
public class Fires {
    public static void main(String args[] ) throws Exception {

        //Write code here
        Scanner sc=new Scanner(System.in);
        int testcases=  1;
        while(testcases!=0){
            int size=3;
            int total[]={2,3,5};

            System.out.print(groups(total));
            testcases--;
        }


    }
    public static int groups(int[] students){
        int total=1;
        int no_of_ways=0;
        for(int i:students){
            total*=i;
            total=total%(int)(Math.pow(10,9)+7);
        }
       for(int i:students){
           if(prime(i,2))
               if(total%(i*i)!=0)
                   no_of_ways++;

       }
        return no_of_ways;
    }
    public static boolean prime(int y,int i){


            if(i < y)
            {
                if(y % i != 0)
                {
                    return(prime(y, ++i));
                }
                else
                {
                    return false;
                }
            }
            return true;

    }
//    public static int check(int first,int second){
//        if(second == 0){
//            return first;
//        }
//        return check(second, first%second);
//    }
}
