import java.util.Arrays;
import java.util.List;
public class GoldenSachs {
    public static void main(String[] args) {
        List<String> mylist;
        String arr[] = {"vivek", "tanuj", "udit", "yogesh", "yash", "sagar", "ankush"};
        mylist = Arrays.asList(arr);
        System.out.println(mylist);
        String[] names = new String[(mylist.size())];
        names = mylist.toArray(names);
         String output=names.toString();
        System.out.println(Arrays.toString(names));
    }
}