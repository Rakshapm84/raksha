import java.util.Scanner;

    import java.util.Scanner;

    class tatastrive{
        String CName1;
        String BName1;
        int CDuration1;
        int count1;
        String Address1;
        long PhoneNumber1;
        tatastrive(String CName,String BName, int CDuration, int count){
            CName1=CName1;
            BName1 = BName;
            CDuration1= CDuration;
            count1=count;
            Address1=Address1;
            PhoneNumber1=PhoneNumber1;

        }
        public void Tsdetail(){
            System.out.println(CName1+" "+BName1+" "+CDuration1+" "+count1);
            System.out.println("TataStrive Address:"+Address1);
            System.out.println("Phone Number:"+PhoneNumber1);
        }
    }
public class TataStrive {
        public static void main(String[] args){
            Scanner input= new Scanner(System.in);
            tatastrive t=new tatastrive("Tata","java",4,30);
            t.Tsdetail();
        }
    }
