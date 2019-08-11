import java.util.Scanner;

 class Geeks {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
       // String str=sc.nextLine();
        String str="DDIDDIID";
        int arr[]=new int[9];

        String []strigs=str.split("");
 int recent  =0;//recent value  of the num
 int num=0;// total number
 int  var=2;//for first character
        int times=strigs.length;
        boolean res= false;
        int  change=1;
        while(times>0) {

            if (change!=0) {

                    arr[0]=1;arr[1]=2;arr[2]=3;arr[3]=4;arr[4]=5;arr[5]=6;arr[6]=7;arr[7]=8;arr[8]=9;
               recent=0;
             num=0;


                if(strigs[0].equals("D")){

                    if(arr[var-1]!=0){
                        recent=arr[var-1];
                        arr[var-1]=0;
                        num=num*10+recent;
                    }
                    else var++;
                }
               else if(strigs[0].equals("I")){

                    if(arr[var-2]!=0){
                        recent=arr[var-2];
                        arr[var-2]=0;
                        num=(num*10)+recent;
                    }
                    else var++;
                }
                change--;
            }
            //for D at any position other than 0


            if (times<=strigs.length) {
                if (strigs[strigs.length-times].equals("D")) {
                    res = true;
                    while (res) {
                        if(recent<2&&num!=2){
                            change++;
                            var++;

                            times=strigs.length+1;
                            break;
                        }
                        if(arr[recent-2]!=0){
                            int local=recent;
                            recent=arr[recent-2];
                            arr[local-2]=0;
                            num=num*10+recent;
                            res=false;
                        }
                        else recent--;


                    }
                }
            }
            //for I at any position other than 0
            if (times<=strigs.length) {
                if (strigs[strigs.length-times].equals("I")) {
                    res=true;
                    while (res) {
                        if(recent>8){
                            change++;
                            var++;

                            times=strigs.length+1;
                            break;}
                        if(arr[recent]!=0){
                            int local=recent;
                            recent=arr[recent];
                            arr[local]=0;
                            num=num*10+recent;
                            res=false;
                        }
                        else recent++;

                    }
                }
            }
            times--;
        }
        System.out.println(num);


    }
}
