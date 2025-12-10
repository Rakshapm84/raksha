class poly {  //method overloading
    public void add(int a, int b) {
        System.out.println(a + b);

    }
}
    class poly1 {
        public void add(int a, int b, int c) {
            System.out.println(a + b + c);

        }
    }
    public class polymorphism {
    public static void main(String[] args){
        poly obj=new poly();

        obj.add(10,30);
        poly1 obj1=new poly1();
        obj1.add(10,30,60);
    }
}
