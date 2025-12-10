class bank{
    public void hdfc(String name,String address){
        System.out.println(name+" "+address);
    }
    public void hdfc(String name,int acno,String ifsc){
        System.out.print(name+" "+acno+" "+ifsc);
    }
}

public class Bank1 {
    public static void main(String[] args) {
        bank obj=new bank();
        obj.hdfc("HDFC","Banglore");
        obj.hdfc("Deepika",123458585,"60vijaya5255");
    }
}
