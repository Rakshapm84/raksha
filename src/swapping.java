import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Swapping:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.print("After Swapping :" + a + "  " + b);
    }
}
