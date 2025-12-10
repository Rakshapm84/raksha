class Car{
    String Name="Benz";
    long Price=9000000;
    String Color="Black";
    int Model=2025;
    String Ref_no="Ka130101";

}
class Bike{
    String Name="Jupiter";
    int Price=100000;
    String Color="Blue";
}

public class oops3 {
    public static void main(String[] args){
        Car obj1=new Car();
        Bike obj2=new Bike();
        System.out.println("Name is:"+obj1.Name+" "+"Price is :"+obj1.Price+" "+"Color is :"+obj1.Color+" "+"Model is :"+obj1.Model+""+"Ref_no is:" +obj1.Ref_no);
        System.out.println("Name is:"+obj2.Name+" "+"Price is :"+obj2.Price+" "+"Color is :"+obj2.Color);


    }
}
