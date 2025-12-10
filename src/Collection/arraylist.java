package Collection;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits);
        fruits.add(2  ,"Grapes");
        System.out.println(fruits);
        fruits.remove(2);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.get(1));
        System.out.println(fruits.set(2,"kivi"));
        System.out.println(fruits.contains("Ban qana"));
        System.out.println(fruits.isEmpty());
        fruits.remove("Banana");
        System.out.println(fruits);

    }
}
