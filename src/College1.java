class college{
    String name;
    String address;
    college(String name,String address){
        this.name=name;
        this.address=address;
    }
    public void cdetails(){
        System.out.println(name+" "+address);
    }
}
class dept extends college{
    String Dname;
    dept(String name,String address,String Dname){
        super(name,address);
        this.Dname=Dname;
    }
    public void ddetails(){
        System.out.println(name+" "+address+" "+Dname);
    }
}
class student extends dept{
    String Sname;String rollno;
    student(String name,String address,String Dname,String Sname,String rollno){
        super(name,address,Dname);
        this.Sname=Sname;
        this.rollno=rollno;
    }
    public void sdetails(){
        System.out.println("College:"+" "+name+" "+address+" "+"Department:"+Dname+" "+"Student:"+Sname+" "+"Rollno:"+rollno);
    }
}
public class College1 {
    public static void main(String[] args) {
        student obj=new student("NCE","Banglore","CSE","Raksha","1001");
        obj.sdetails();
    }
}