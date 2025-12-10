import java.util.Scanner;

class person11{
    public void details(String name,int age){
        System.out.print(name +" "+ age);
    }
}
public class examplemethod {
    public static void main(String[] args){
        person11 obj=new person11();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Person details:");
        String name=sc.nextLine();
        int age=sc.nextInt();
        obj.details(name,age);
        obj.details("hhh",23);
    }
}
