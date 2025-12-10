interface C1   //interface only use default method  &  doesnt support void method
{
    default int demo7(int a, int b) {  // default method
        return a+b;
    }
    static void demo9()
    {
        System.out.println("static methods");
    }
}
class demo7 implements C1 {

}
    public class methodinterface {
    public static void main(String[] args){
        demo7 obj=new demo7();
        System.out.println(obj.demo7(5,1));
        C1.demo9();
    }
}
