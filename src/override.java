class a1 {
    public void mobile()
    {
        System.out.println("Nokia c1");
    }
}
class b1 extends a1 {
    public void mobile() {
        System.out.println("Samsung");
    }
}
    public class override {
    public static void main(String[] args){
        b1 obj=new b1();
        obj.mobile();
    }
}
