public class exception {
    public static void main(String[] args) {
        int a=8;
        int b=2;// if denominator become 0 we need to use trycatch
        //like this type of situtaion we need to use try catch
        try{
            int c=a/b;

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
