class Node{
    Node next;
    int data;
}
public class RemoveLoop {
    public static void removeTheLoop(Node head) {
        Node hare = head.next;
        Node tortoise = head;
        while (hare != null && tortoise != null && hare != tortoise) {
            hare = hare.next;
            tortoise = tortoise.next;
            if (hare != null)
                hare = hare.next;
            if (hare == tortoise)
                break;
        }
        if (hare == null) return;
        Node begin = head;
        while (hare.next != begin) {
            hare = hare.next;
            begin = begin.next;
        }
        hare.next = null;

    }

    public static void reverseWords(String sd) {
        // Your code here
        String emptyString = "";
        String mystring[] = sd.split("\\.",-2);
        for (int i = mystring.length - 2; i >= 0; i--) {
            emptyString += mystring[i] + ".";
        }
        emptyString+=mystring[mystring.length-1];
        System.out.print(emptyString);
    }
    public static boolean checkPanagram  (String s)
    {
        // your code here
        boolean res=true;
        s=s.toLowerCase();
        int freq[]=new int[26];
        char[] characters=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if((characters[i]-97)>=0&&(characters[i]-97)<123)
                freq[characters[i]-97]++;
        }
        for(int i =0;i<26;i++){
            if(freq[i]<=0){
                res=false;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxyz.=j+";
        //reverseWords(s);
        System.out.println(  checkPanagram(s));
    }
}
