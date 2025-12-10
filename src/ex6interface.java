 interface Bird
 {
    void bird1(String color, int age);
}

interface parrot extends Bird
{
    void parrot1(String color);
}

interface peacock extends Bird
{
    void peacock1(String color);
}

class pigeon implements Bird {

    public void bird1(String color, int age) {
        System.out.println("pigeon color is: " + color+ " Bird Age is: " + age);
    }

    public void parrot1(String color) {
        System.out.println("parrot color is: " + color);
    }

    public void peacock1(String color) {
        System.out.println("Peacock color is: " + color);
    }
}

 public class ex6interface {
    public static void main(String[] args){
        pigeon obj = new pigeon();

        obj.bird1("white", 3);
        obj.parrot1("Green");
        obj.peacock1("Blue");
    }
}

