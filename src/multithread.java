class multi extends Thread{ ///   if we remove threwad it is called it has class otherwise it called iot as  thread
    public void run(){
        System.out.println("Thread 1");
    }// smallest projects it sis called it as thread

}
class multi3 extends Thread{
public void run(){
    System.out.println("Thread 2");
}
}
public class multithread {
    public static void main(String[] args)// without thread we cannot run project.
    {
     Thread t1=new multi();
     t1.start();
     Thread t2=new multi3();
     t2.start();
    }
}
