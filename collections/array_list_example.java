import java.util.ArrayList;
import java.util.List;
public class array_list_example {
    public static void main(String args[]){
        List<String> names=new ArrayList<>();
        names.add("reddy");
        names.add("sekhar");
        names.add("java");

        System.out.println("names:"+names);
        System.out.println("1st name:"+names.get(0));
    }
}