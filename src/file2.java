import java.io.FileOutputStream;
import java.io.IOException;

public class file2 {
    public static void main(String[] args) throws IOException {
        String content="Hello World!";
        try(FileOutputStream obj=new FileOutputStream("raksha.txt")){
            byte[] bytes=content.getBytes();// bytes is just a name;
            obj.write(bytes);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}










