abstract class abc {
    String name;
    String color;

    abc(String name, String color) {
        this.name = name;
        this.color = color;
    }

    abstract void Bird1();

    abstract void Bird2(String name, String color, int age);

    void dog(String name, String Breed, String color) {
        System.out.println(name + " " + Breed + " " + color);
    }
}
class abd extends abc {
    abd(String name, String color) {
        super(name, color);
    }

    void Bird1() {

        System.out.println(name + " " + color);
    }

    void Bird2(String name, String color, int age) {
        System.out.println(name + " " + color + " "+age);
    }
}

    public class birds {
        public static void main(String[] args){
            abd obj=new abd("peacock", "green");
            obj.Bird1();
            obj.Bird2("pigeon","gray",5);
            obj.dog("charliee","german","white");
        }
    }
