class java {
    public void greet() {// we should print directly it will not return
        System.out.println("Hello Developer");
    }
    public int add(int a ,int b)//it should be return
    {
        return a+b;//multiple methods
    }
    public int sub(int a ,int b){
        return a-b;
    }
}
    public class userdefine {
        public static void main(String[] args) {
            java obj = new java();
            obj.greet();
            int r=obj.add(4,1);
            System.out.println(r);
            int s=obj.sub(12,1);
            System.out.println(s);
        }
    }
