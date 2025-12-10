import java.util.Scanner;

public class Marks {
    public static void main(String[] aregs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 100");
        int m = sc.nextInt();
        if (m > 90) {
            System.out.println("A is Largest");
        } else if (m > 80) {
            System.out.println("B is Largest");
        } else if (m > 70) {
            System.out.println("c is Largest");
        } else if (m > 60) {
            System.out.println("d is Largest");
        } else if (m > 50) {
            System.out.println("e is Largest");
        } else {
            System.out.println("Fail");
        }
    }
}
