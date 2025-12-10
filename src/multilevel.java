class Aa
{
    public void demo1()
    {
        System.out.println("Grand parent");
    }
}
class B1 extends Aa
{
    public void demo2()
    {
        System.out.println("Parent");
    }
}
class C extends B1
{
    public void demo3()
    {
        System.out.println("Child");
    }
}
public class multilevel
{
    public static void main(String[] args){
        C obj=new C();//if we create object of an A and B it show the error so we shouls call c variable
        obj.demo1();
        obj.demo2();
        obj.demo3();
    }
}