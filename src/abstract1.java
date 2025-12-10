abstract class demo {   //abstract class
    abstract void display();
    abstract void show();
    void java(){
        System.out.println("normal methods");
    }
}
class demo1 extends demo {
    void display() {  // abstract method
        System.out.println("Abstract class and methods");
    }
    void show() {
        System.out.println("Welcome to java");
    }
}
    public class abstract1 {
    public static void main (String[] args)
    {
        demo1 obj =new demo1();
        obj.display();
        obj.show();
        obj.java();
    }
}
