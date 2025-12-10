 class java1 {
    public int add(int a ,int b)//it should be return
    {
        return a+b;//multiple methods
    }
    public int sub(int a ,int b)
    {
        return a-b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
     public float div(int a,int b)
     {
         return a/b;
     }
 }

public class ass1 {
    public static void main(String[] args) {
        java1 obj = new java1();
        int r=obj.add(4,1);
        System.out.println(r);
        int s=obj.sub(12,1);
        System.out.println(s);
        int a=obj.mul(10,9);
        System.out.println(a);
        float b=obj.div(10,5);
        System.out.println(b);
    }
}
