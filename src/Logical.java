import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter a value");
        int b = sc.nextInt();
        System.out.println(a > b && a == 0);
        System.out.println(a <= 2 || b > a);
        System.out.println(!(a <= 2 || b > a));
    }
}
