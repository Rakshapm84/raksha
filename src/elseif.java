import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + "Number is +ve");
        } else if (n<0) {
            System.out.println(n + "Number is -ve");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
}