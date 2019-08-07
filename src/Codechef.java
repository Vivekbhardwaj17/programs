/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Codechef {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
            int  testcase=0;
            int size=0;
            String s1=rd.readLine();
            if(s1!=null){
                testcase=Integer.parseInt(s1);}
            while(testcase!=0){
                String s2=rd.readLine().trim();
                if(s2!=null){
                    size=Integer.parseInt(s2);}
                String[] goals=rd.readLine().split(" ");

                String[] fouls=rd.readLine().split(" ");

                System.out.println( maxPoint(size,goals,fouls));
                testcase--;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static int maxPoint(int size,String[]goals,String[]fouls){
        int maxpoint= 0;
        try {
            maxpoint = 0;
            for(int i=0;i<size;i++){
                int player_goals= (Integer.parseInt(goals[i])*20)-(Integer.parseInt(fouls[i])*10);
                if(player_goals<0)
                    player_goals=0;
                if (maxpoint<player_goals)
                    maxpoint=player_goals;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maxpoint;
    }
}

