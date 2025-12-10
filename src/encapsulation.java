class encap1  //read only method is also called as getter method
{
    private String name="Raksha";
    private int Age=22;
    public String getname()
    {
        return name;
    }
    public int getAge()
    {
        return Age;
    }
}
public class encapsulation {
    public static void main(String[] args)
    {
        encap1 obj=new encap1();
        System.out.println(obj.getname()+" "+obj.getAge());
    }
}
