package Collection;

import java.util.HashSet;
import java.util.Set;

public class hashset{
        public static void main(String[] args){
            Set<Integer> n = new HashSet<>();
            n.add(1);
            n.add(21);
            n.add(32);
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

