package Collection;

import java.util.LinkedHashSet;

public class Linkedhashset1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> n = new LinkedHashSet<>();
        n.add(1);
        n.add(2);
        n.add(3);
        System.out.println(n);
        n.remove(21);
        System.out.println(n);
        System.out.println(n.contains(14));
        System.out.println(n.size());
        n.iterator();
        System.out.println(n);
        n.clear();
        System.out.println(n);
        n.equals(8);
        System.out.println(n);
        System.out.println(n.isEmpty());
    }
}
