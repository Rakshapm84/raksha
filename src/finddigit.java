import java.util.Scanner;

public class finddigit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int n=num;
        int count=0;
        while(num!=0) {
            int a = num/10;
            count++;
        }
        System.out.print("Count is :"+count);
    }
}
