abstract class abs
{
    abstract void person(String name,int age);
}
class ab extends abs {
    void person(String name, int age) {
        System.out.println(name + " " + age);
    }
}
    public class abstract2 {
        public static void main(String[] args) {
            ab obj=new ab();
            obj.person("raksha",22);

        }
    }
