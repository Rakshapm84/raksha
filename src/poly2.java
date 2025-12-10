class Shape{
    public int area(int a)
    {
        return a*a;
    }
    public int area(int l,int b)
    {
        return l*b;
    }
    public double area(double r)
    {
        return 3.14*r*r;
    }
}
public class poly2 {

    public static void main(String[] args)
    {
       Shape obj=new Shape();
       System.out.println("Area of Square:" +obj.area(5));
        System.out.println("Area of Rectangle:" +obj.area(5,3));
        System.out.println("Area of circle:" +obj.area(5.1));
    }
}
