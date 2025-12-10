class encap3
{// write -only method it is called setter method
    private String name="Deepika H G";
    private int age=23;
    private String branch="CSE";
    private String address="Hassan";
    public void setname(String name1) {
        name = name1;}
    public void setage(int age1) {
        age = age1;}
    public void setbranch(String branch1) {
        branch = branch1;}
    public void setaddress(String address1) {
        address= address1;}
    public String getname() {
        return name;}
    public int getage() {
        return age;}
    public String getbranch() {
        return branch;}
    public String getaddress() {
        return address;}
}
public class encapsulation3 {
    public static void main(String[] args){
        encap3 obj=new encap3();
        obj.setname("Raksha P M");
        obj.setbranch("M E");
        obj.setaddress("Mysuru");
        System.out.println(obj.getname()+"  "+obj.getage()+"  "+obj.getbranch()+"  "+obj.getaddress());}
}
