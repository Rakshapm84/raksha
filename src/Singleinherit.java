class a {
    public void demo1() {//method
        System.out.println("Hello parent");
    }
}
    class b extends a {
        public void demo2() {
            System.out.println("Hello child and parent");
        }
    }

    public class Singleinherit {
        public static void main(String[] args) {
            b obj=new b();
            obj.demo1();
            obj.demo2();
        }
    }
