class Employee{
    String Emp_name = "Raksha P M";
    int Emp_id = 00001;
    int Emp_salary=50000;
}
class Department1 {
    String Dep_name = "Developer";
    int Dep_id =00123;
}
public class dep {
    public static void main(String[] args){
        Employee obj=new Employee();
        Department1 obj1=new Department1();
        System.out.println("Emp_name is:"+obj.Emp_name+" , "+"Emp_id is:"+obj.Emp_id+" , "+"Emp_salary is:"+obj.Emp_salary);
        System.out.println("Dep_name is:"+obj1.Dep_name+" , "+"Dep_id is:"+obj1.Dep_id);
    }
}
