interface A3 {
    void greet();
}
class A4 implements A3 {// interface to class it is called  as implements;

    public void greet()
    {
        System.out.println("Interface in java");
}
}
    public class interface1 {
    public static void main(String[] args){
        A4 obj=new A4();
        obj.greet();
    }
}
