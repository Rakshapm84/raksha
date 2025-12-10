import java.util.Scanner;

class company{
    public int employee(String name,String Salary,String role)
    {
        System.out.println(name +" "+Salary+" "+role);
        return 0;
    }
    public int department(String dep,int depID){
        System.out.print(dep+" "+depID);
        return depID;
    }
    public class ex2 {
    }
    public static void main(String[] args){
        company obj =new company();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee name:");
        String name=sc.nextLine();
        System.out.println("Enter Employee Salary:");
        String salary=sc.nextLine();
        System.out.println("Enter Employee role:");
        String role=sc.nextLine();

        int i=obj.employee(name,salary,role);
        System.out.println("Enter Department name:");
        String dep=sc.nextLine();
        System.out.println("Enter Department ID :");
        int depID=sc.nextInt();
        int j=obj.department(dep,depID);

    }
}
