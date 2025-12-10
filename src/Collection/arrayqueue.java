package Collection;

import java.util.ArrayDeque;

public class arrayqueue {
        public static void main(String[] args){
            ArrayDeque<Integer> name=new ArrayDeque<>();
            name.offer(32);
            name.offer(100);
            name.offer(38);
            name.offer(15);

            System.out.println(name);
            System.out.println(name.poll());
            System.out.println(name);
            System.out.println(name.peek());
            System.out.println(name);
            name.push(10);
            System.out.println(name);
            name.pop();
            System.out.println(name);
            name.addFirst(29);
            System.out.println(name);
            name.addLast(20);
            System.out.println(name);
            name.removeFirst();
            System.out.println(name);
            name.removeLast();
            System.out.println(name);
            System.out.println(name.poll());
            System.out.println(name.size());
            System.out.println(name.isEmpty());
            name.add(15);
            System.out.println(name);


        }
    }

