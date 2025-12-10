import java.util.Scanner;

public class nestedifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  a value:");
        int a = input.nextInt();
        System.out.println("Enter the  b value:");
        int b = input.nextInt();
        System.out.println("Enter the  c value:");
        int c = input.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is large");
            } else {
                System.out.println(c + " is large");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is large");
            } else {
                System.out.println(c + "is larger");
            }
        }

    }
}
