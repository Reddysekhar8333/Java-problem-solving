import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
public class hash_set {
    public static void main(String args[]){
        Set<String> cities=new HashSet<>();
        cities.add("tirupati");
        cities.add("piler");
        cities.add("chittor");
        cities.add("tirupati");
        System.out.println("cities:"+cities);

        Map<String,Integer> students=new HashMap<>();
        students.put("reddy",100);
        students.put("monkey",10);
        students.put("koti",95);
        System.out.println("students marks:"+students);
        System.out.println("reddy"+students.get("reddy"));
    }    
}
