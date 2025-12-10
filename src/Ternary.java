import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter a value");
        int b = sc.nextInt();
        int r = (a > b) ? a : b;//if the condition is true it will display on inside the between the question marks and colan.
        System.out.println(r);
    }
}

