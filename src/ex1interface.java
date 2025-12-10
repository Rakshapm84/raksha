interface A6
{
    int a=3;
    static int b=5;
    final int c=12;
}
class demo8 implements A6{

}
public class ex1interface {
    public static void main(String[] args){
        demo8 obj =new demo8();
        System.out.println(A6.a);
        System.out.println(A6.b);
        System.out.println(A6.c);
    }
}
