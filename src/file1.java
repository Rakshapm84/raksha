import java.io.File;  //using Filke
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class file1 {
    public static void main(String[] args) {
        File obj=new File("abc.txt");
        try {
            if(obj.createNewFile())
            {
                System.out.println("File created");
            }
            else
            {
                System.out.println("File already exists");
            }
            FileWriter obj1=new FileWriter("abc.txt");
            obj1.write("Hello World");
            obj1.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    }
