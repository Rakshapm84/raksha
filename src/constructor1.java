class A
{
    A()
    {
        System.out.println("Hello");
    }
    A(int a)
    {
        System.out.println(a);
    }
    A(int a,int b)
    {
        System.out.println(a+""+b);
    }

}
    public class constructor1 {
    public static void main(String[] args){
        A obj=new A();
        A obj1=new A(5);
        A obj2=new A(10,20);
    }
}
