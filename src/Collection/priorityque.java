package Collection;
import java.util.PriorityQueue;
public class priorityque {
    public static void main(String[] args){
        PriorityQueue<Integer> name=new PriorityQueue<>();
        name.offer(30);
        name.offer(6);
        name.offer(8);
        name.offer(10);

        System.out.println(name);
        System.out.println(name.poll());
        System.out.println(name);
        System.out.println(name.peek());
        System.out.println(name);

    }
}
