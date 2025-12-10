interface Grandfather
{
    void grandfather(String name ,int age);
    }
    interface father extends Grandfather
    {
        void father(String name ,int age);
}
class child1 implements father
{

    public void father(String name ,int age)
    {
        System.out.println("name is:"+name +" age is :"+age);
    }
    public void grandfather(String name ,int age)
    {
        System.out.println("name is:"+name +" age is :"+age);
    }
}

public class ex4interface {
    public static void main(String[] args)
    {
        child1 obj=new child1();
        obj.father("mallegowda",45);
        obj.grandfather("javregowda",66);
    }
}
