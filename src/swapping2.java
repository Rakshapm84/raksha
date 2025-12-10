import java.util.Scanner;

public class swapping2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Swapping:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.print("After Swapping :" + a + "  " + b);
    }
}

