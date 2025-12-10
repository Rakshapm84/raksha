package Collection;

import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.push(1);
        num.push(2);
        num.push(3);
        System.out.println(num);
        num.pop();
        System.out.println(num);
        System.out.println(num.peek());
        System.out.println(num.isEmpty());
        System.out.println(num.capacity());
        System.out.println(num.iterator());
    }
}
