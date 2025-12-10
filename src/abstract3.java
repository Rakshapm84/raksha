abstract class raksha {
    String name;

    raksha(String name) {
        this.name = name;
    }
}
class ab1 extends raksha
{
    ab1(String name)
    {
        super(name);
    }
    void details(){
        System.out.println(name);
    }
}
public class abstract3 {
    public static void main(String[] args){
       ab1 obj=new ab1("Raksha") ;// if construct we need to pass in obj
        obj.details();

    }
}
