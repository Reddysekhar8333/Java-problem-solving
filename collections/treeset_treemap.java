import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
import java.util.Set;
public class treeset_treemap {
    public static void main(String[] args) {
        Set<String> names=new TreeSet<>();
        names.add("yuva");
        names.add("sekhar");
        names.add("bobby");
        System.out.println("sorted names:"+names);

        Map<String,Integer> score=new TreeMap<>();
        score.put("reddy",95);
        score.put("roudy",35);
        score.put("buddy",75);
        System.out.println("scores in sorted orders:"+score);

    }
}
