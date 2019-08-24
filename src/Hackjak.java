import java.util.Scanner;

public class Hackjak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  arr[]=new int[n];
        int arr1[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
         int  value=   gcd(arr[i],arr[i+1]);
        }
    }
   public static int gcd(int first,int last){
        while(first>last){
            int local=first%last;
            int second =last%local;

        }
        return first;
    }
}
