interface child001 {
    void child1(String name, String address);
}

interface child02 extends child001 {
    void child2(String name, String address, int age);
}

interface child03 extends child02 {
    void child3(String name, String address, int age);
}

class child002 implements child03 {

    public void child1(String name, String address) {
        System.out.println("name is: " + name + " address is: " + address);
    }

    public void child2(String name, String address, int age) {
        System.out.println("name is: " + name + " address is: " + address + " age is: " + age);
    }

    public void child3(String name, String address, int age) {
        System.out.println(name + " " + address + " " + age);
    }
}

public class ex5interface {
    public static void main(String[] args){
        child002 obj = new child002();

        obj.child1("Raksha", "Bangalore");
        obj.child2("Deepika", "Hassan", 23);
        obj.child3("Vandana", "Mysuru", 24);
    }
}
