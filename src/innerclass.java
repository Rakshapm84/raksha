class outer   // inner classs
// it shoud be craete an object inside class not in main method  // method local class
{
    private class inner //it mejority it is private
    {
        public void innermethod()
        {
            System.out.println("Inner class data");
        }
    }
    void details() {
        inner obj1 = new inner();
        obj1.innermethod();
    }
}

public class innerclass {
    public static void main(String[] args){
        outer obj=new outer();
        obj.details();
    }
}
