import java.util.Scanner;

public class armstrongnum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int n=num;
        int r=0;
        while(num!=0) {
            int a = num % 10;
            r = r + a * a * a;
            num = num / 10;
        }
        if(r==n)
        {
            System.out.println(n+" this is a armstrong number");
        }
        else{
            System.out.println(n+" is not a armstrong number");
        }
    }
}
