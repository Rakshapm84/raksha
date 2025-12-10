class interface11 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Java Developer");
        }
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class react implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Web Developer");
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class Runable_interface_multithread {
    public static void main(String[] args) {
        interface11 obj = new interface11();
        react obj1=new react();
        Thread thread1 = new Thread(obj);
        Thread thread2 = new Thread(obj1);
        thread1.start();
        thread2.start();
    }
}
