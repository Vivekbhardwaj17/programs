/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int value=1;
        for(int i=0;i<n-1;){
            if(arr[i]==value){
                if(arr[i]==arr[i+1]){
                    i=i+2;
                }
                else {
                    i++;
                }
            }
            else{
                System.out.print(value+" ");
           // System.out.println();
        }
        value++;
        }
        //Write code here

    }
}

