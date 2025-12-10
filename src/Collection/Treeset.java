package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> n = new TreeSet<>();
        n.add(1);
        n.add(21);
        n.add(32);
        n.add(43);
        n.add(54);
        System.out.println(n);
        n.remove(43);
        System.out.println(n);
        System.out.println(n.first());//smallest
        System.out.println(n.last());//largest
        System.out.println( n.ceiling(21));// it will greater than eqaul to
        System.out.println( n.floor(34));// it will print smaller
        System.out.println( n);
        System.out.println( n.higher(2));
        System.out.println( n);
        System.out.println( n.lower(3));
        System.out.println( n);
    }
}
