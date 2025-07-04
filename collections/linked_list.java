import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
public class linked_list {
    public static void main(String args[]){
        Queue<Integer> numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Queue:"+numbers);
        System.out.println("Removed:"+numbers.poll());
        System.out.println("Added:"+numbers.offer(100));
        System.out.println("Queue after removed:"+numbers);

        Stack<String> names=new Stack<>();
        names.add("reddy");
        names.add("sekhar");
        names.add("monkey");
        names.add("donkey");

        System.out.println("Queue:"+names);
        System.out.println("Removed:"+names.pop());
        System.out.println("Added:"+names.push("kothi"));
        System.out.println("Queue after removed:"+names);
    }
}
