
import java.util.*;
import java.util.LinkedList;
    public class Linkedlist2 {
        public static void main(String[] args) {
            LinkedList<String> car=new LinkedList<>();
            car.add("INOVA");
            car.addFirst("SWIFT");
            car.addLast("I20");
            System.out.println(car);

            System.out.println(car.indexOf("SWIFT"));

            System.out.println(car.poll());// it will remove that elements

            System.out.println(car.poll());


            System.out.println(car.peek());

            car.offer("kn");

            System.out.println(car);

            car.add(2  ,"BMW");
            System.out.println(car);
            car.remove(2);
            System.out.println(car);
            System.out.println(car.size());
            System.out.println(car.get(1));
            System.out.println(car.set(1,"KIYA"));
            System.out.println(car.contains("BENZ"));
            System.out.println(car.isEmpty());
            car.remove("Banana");
            System.out.println(car);

        }
    }
