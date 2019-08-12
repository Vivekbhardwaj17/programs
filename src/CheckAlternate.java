import java.util.Scanner;

public class CheckAlternate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();


        while(testcases!=0){
            int i=0;
            int count=0;
            sc.nextLine();
            String str=sc.nextLine();
            while (i!=str.length()) {

                if(Character.getNumericValue(str.charAt(i))==i%2)
                    i++;
                else {
                    count++;
                    i++;
                }
            }
            System.out.println(count/2);
            testcases--;
        }
    }
}
