import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out .println("Enter a value");
        int a=sc.nextInt();
        System.out .println("Enter a value");
        int b=sc.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(a<<b);
        System.out.println(a>>b);
    }

}