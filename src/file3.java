import java.io.FileReader;

public class file3 {
    public static void main(String[] args) {
        try(FileReader obj=new FileReader("raksha.txt"))
        {
            int c;
            while((c=obj.read())!=-1)// if we need to single
            {
                System.out.print((char)c);
            }
        }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }