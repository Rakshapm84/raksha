class mobile1 {
    public void mobile(String Name,String  RAM,String Processor,int Androidversion,String phonestorage)
    {
        System.out.println(Name+" "+RAM+" "+Processor+" "+Androidversion+" "+phonestorage);
    }
}
class laptop extends mobile1 {
    public void mobile(String Name,String  RAM,String Processor,int Androidversion,String phonestorage)
    {
        System.out.println(Name+" "+RAM+" "+Processor+" "+Androidversion+" "+phonestorage);
    }
    public void laptop(String Name1,String RAM1,String Processor1,int version1,String laptopstorage){
        System.out.println(Name1+" "+RAM1+" "+Processor1+" "+version1+" "+laptopstorage);
    }
}
public class override1 {
    public static void main(String[] args){
        laptop obj=new laptop();
        obj.mobile("vivo","12GB","2.2GH",15,"15");
        obj.laptop("DELL","16GB","i5",13,"154GB");
    }
}