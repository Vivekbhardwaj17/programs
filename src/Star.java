import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int value=1;
        int temp=n-1;
        int s=(n*n)+1;
        int copy =s;
        for (int i = 0; i <n ; i++) {
            for (int k = 0; k <i ; k++) {
                System.out.print("----");
            }
            for (int j = n; j >i ; j--) {
                if(j>=i+2){
                System.out.print(value+"  "+"*");
                value++;}
                if(j==i+2){
                System.out.print(value+"   ");
                value++;}
                if(i==n-1){
                    System.out.print(value+"  ");
                value++;}

            }

            for (int q = n; q >i ; q--) {
                System.out.print("*"+s+"  ");
                s++;
            }
            copy-=temp;
            s=copy;
            temp--;
            System.out.println();
        }
    }
}
