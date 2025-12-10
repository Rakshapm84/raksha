class Dog1 {
    String color;

    Dog1(String color) {
        this.color = color;
    }

    public void ddetails() {

        System.out.println(color);
    }
}
class BabyDog extends Dog1 {
    String name;

    BabyDog(String name, String color) {
        super(color);
        this.name = name;
    }

    public void bdetails() {
        System.out.println(name + "    " + color);
    }
}
    public class single1 {

    public static void main(String[] args) {
        BabyDog obj = new BabyDog("charli" ,  "White");
        obj.bdetails();
    }
}

