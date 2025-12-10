class outer1 // inner class
{
    private int age=18;
    public class inner2
    {
        int getValue()
        {
            return age;
        }
    }
}
public class inner2 {
    public static void main(String[] args)
    {
        outer1 obj=new outer1();
        outer1.inner2 obj2= obj.new inner2();
        System.out.println(obj2.getValue());
    }
}
