abstract class demo9 {
    abstract void add(int a, int b);
}
public class inner4 {
    public static void main(String[] args) {
        {
            demo9 obj = new demo9() {
                public void add(int a, int b) {
                    System.out.println(a + b);
                }
            };
            obj.add(3, 4);
        }
    }
}
