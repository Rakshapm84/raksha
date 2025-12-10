class encap2  // write -only method it is called setter method
{
    private String name="P M Raksha";
    private int age=23;
    public void setname(String name1) {
        name = name1;
    }
    public void setage(int age1) {
        age = age1;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
}
public class encapsulation2 {
    public static void main(String[] args){
        encap2 obj=new encap2();
        obj.setname("deepika");
        obj.setage(23);
        System.out.println(obj.getname()+" "+obj.getage());
    }
}
