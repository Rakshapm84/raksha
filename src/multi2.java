class Vehicle2
{
    String color2;
    Vehicle2(String color)
    {
        this.color2=color;
    }
    public void vdetails()
    {
        System.out.println(color2);
    }
}
class car1 extends Vehicle2
{
    String reg_no;
    double price;
    car1(String reg_no,double price,String color)
    {
        super(color);
        this.reg_no=reg_no;
        this.price=price;
    }
    public void cdetails()
    {
     System.out.println(reg_no+" "+price+" "+color2);
    }
}
class bike extends car1
{
    String name;
    bike(String color2,double price,String reg_no,String name)
    {
        super(reg_no,price,color2);
        this.name=name;
    }
    public void bdetails()
    {
        System.out.println(name+" "+reg_no+" "+price+" "+color2);
    }

}


    public class multi2 {
    public static void main(String[] args){
        bike obj=new bike("white",3000000,"ka130666","ktm");
        obj.bdetails();

    }
    }
