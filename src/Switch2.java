import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a marks ");
        int marks = sc.nextInt();
        switch(marks)
        {
            case 90:
                System.out.println("It is A");
                break;
            case 80:
                System.out.println("It is B");
                break;
            case 70:
                System.out.println("It is C");
                break;
            case 40:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
    }
}
