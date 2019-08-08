import java.util.Scanner;

public class MagicTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // int n=5;// my test case no change
        int value=0;//my_inserted no change
        int  diff=0;
                                                          int size=0; // for variable  can change
                                                         // for variable can change ****************************
        int  test=2; //for loop times have to change
        int[][]arr=new int[n][n];
        while(value!=(n*n)) {
            int i=0+diff;
            for (int j = 0+diff; j <n-diff ; j++) {
                value++;
                arr[i][j]=value;

            }
            i=n-1-diff; //***********************************
            for (int j = 0+diff; j <n-diff ; j++) {
                arr[j][i]=value;
                value++;
            }

            for (int l = n-2-diff; l >=0+diff ; l--) {
                arr[i][l]=value;
                value++;
            }
            i=0+diff;//*****************************************
            for (int j = n-2-diff; j >0+diff; j--) {
                 arr[j][i]=value;
                 value++;
            }
            --value;
           diff++;
            test--;
        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k <n ; k++) {
                System.out.print(arr[j][k]+"       ");
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}
