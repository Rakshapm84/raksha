import java.util.Scanner;

public class arithematic {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b values");
        int a=sc.nextInt();
        int b =sc.nextInt();
        System.out.println("addition"+(a+b));
        System.out.println("sub"+(a-b));
        System.out.println("mul"+(a*b));
        System.out.println("div"+(a/b));
        System.out.println("mod"+(a%b));
        System.out.println("post increment" +(b++));
        System.out.println("pre decrement" +(--a));
        System.out.println("post increment" +(a++));
        System.out.println("post decrement" +(b--));
        System.out.println("pre decrement" +(--b));
        System.out.println("post decrement" +(a--));
        System.out.println("pre increment" +(++a));
        System.out.println("pre increment" +(++b));
    }
}
