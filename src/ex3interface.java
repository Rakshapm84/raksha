interface Ab{
    void add(int a,int b);
}
interface Ba
{
    void sub(int c,int d);
}
class demo11 implements Ab,Ba
{
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void sub(int a,int b)
    {
        System.out.println(a-b);
    }
}
public class ex3interface {
    public static void main(String[] args)
    {
        demo11 obj=new demo11();
        obj.add(10,20);
        obj.sub(9,3);
    }
}
