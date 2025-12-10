 class outer4  //method local class
         // inside the  class we have method
 {
     void demo7() {   //inside the method we class
         class inner4 {
             void demo8()

             {
                 System.out.println("Method local innerclass");

             }
         }
         inner4 obj2=new  inner4();
         obj2.demo8();
     }
 }
     public class inner3 {
    public static void main(String[] args){
        outer4 obj=new outer4();
        obj.demo7();
    }
}
