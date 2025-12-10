class cat1{
    String name;
    String color;
    cat1(String name,String color){
        this.name=name;
        this.color=color;

    }
    public void catdetails() {
        System.out.println(name + " " + color);
    }
}
class bcat extends cat1{
    int age;
    bcat(int age,String name,String color)
    {
        super(name,color);
        this.age=age;
    }
    public void cdetails()
    {
        System.out.println(" "+age+ " "+name+ " "+color);
    }
}
    public class cat {
    public static void main(String[] args){
       bcat obj=new bcat(3,"cutiee","white");
       obj.cdetails();
    }
}
