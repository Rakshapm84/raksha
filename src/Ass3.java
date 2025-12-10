class person3 {
    String name1;
    int age1;
    String branch1;
    String usn1;

    person3(String name, int age,String branch,String usn) {
        name1 = name;
        age1 = age;
        branch1=branch;
        usn1=usn;
    }

    public void details() {
        System.out.println(name1 + " " + age1+" "+branch1+" "+usn1);
    }
}
public class Ass3 {
    public static void main(String[] args){
        person3 obj=new person3("Raksha",22,"Computer Science and Engg","4YG22CS410");
        obj.details();
    }
}

