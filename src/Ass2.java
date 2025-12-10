class person2 {
    String name1;
    int age1;

    person2(String name, int age) {
        name1 = name;
        age1 = age;
    }

    public void details() {
        System.out.println(name1 + "" + age1);
    }
}
    public class Ass2{
    public static void main(String[] args){
        person2 obj=new person2("Raksha",22);
        obj.details();
    }
}