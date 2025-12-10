import java.util.Scanner;

class Vehicle1{
    String vName1;
    String regNo1;
    double price1;
    String color1;
    Vehicle1(String vName,String regNo,double price, String color){
        vName1=vName;
        regNo1 = regNo;
        price1 = price;
        color1= color;

    }
    public void vdetail(){
        System.out.println(vName1+" "+regNo1+" "+price1);
        System.out.println("Vehicle color:"+color1);
    }
}
public class vehicle {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Vehicle1 v=new Vehicle1("Benz","KA1302343",8000000,"Black");
        v.vdetail();
    }
}
