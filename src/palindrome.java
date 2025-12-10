import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt(); //121
        int n=num;
        int r=0;
        while(num!=0) {
            int a = num % 10;
            r = r * 10 + a;
            num = num / 10;
        }
        if(n==r)
        {
            System.out.print(n+" number is palindrome");
        }
        else
        {
            System.out.print(n+" number is not a palindrome");
        }
    }
}
