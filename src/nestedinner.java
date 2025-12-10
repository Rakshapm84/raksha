class outer10
{
    static class inner5
    {
        void demo10()
        {
            System.out.println("static nested class");
        }
    }
}
public class nestedinner {
    public static void main(String[] args)
    {
        outer10.inner5 obj=new outer10.inner5();
        obj.demo10();
    }
}

