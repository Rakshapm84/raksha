class dog {
    String name = "Munna";
    int age = 2;
    String Color="white";
}
class Cat{
    String name = "kitty";
    String color ="pink";
}
public class oops2 {//multipe object by using same class
public static void main(String[] args){
    dog obj=new dog();
    Cat obj1=new Cat();
    System.out.print("name is:"+obj.name+" "+"Color is:"+obj.Color+" "+"age is:"+obj.age);
    System.out.print("name is:"+obj1.name+" "+"Color is:"+obj1.color);
    }
}
