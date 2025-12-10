class car10 {
    String fueltype;
    int no_of_seats;

    car10(String fueltype, int no_of_seats) {
        this.fueltype = fueltype;
        this.no_of_seats = no_of_seats;
    }

    public void cardetails() {
        System.out.println(fueltype + " " + no_of_seats);
    }
}
class Swift extends car10 {
    String color2;
    double price2;
    int model2;

    Swift(String fueltype,int no_of_seats,String color2,double price2, int model2) {
        super(fueltype,no_of_seats);
        this.color2 = color2;
        this.price2 = price2;
        this.model2=model2;
    }
    public void Swiftdetails() {
        System.out.println(fueltype + " " + no_of_seats+" "+color2+" "+price2+" "+model2);
    }
}
class BMW extends car10 {
    String color;
    double price1;
    int model1;

    BMW(String fueltype,int no_of_seats,String color,double price1, int model1) {
        super(fueltype,no_of_seats);
        this.color = color;
        this.price1 = price1;
        this.model1=model1;
    }
    public void BMWdetails() {
        System.out.println(fueltype + " " + no_of_seats+" "+color+" "+price1+" "+model1);
    }
}
public class hierchy1 {
    public static void main(String[] args)
    {
        Swift obj=new Swift("CNG",10,"white",2000000,2010);
        obj.Swiftdetails();
        BMW obj2=new BMW("petrol",2,"black",100000,2014);
        obj2.BMWdetails();
    }
}
