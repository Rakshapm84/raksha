class pqr extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Java Developer");
            try
            {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class xyz extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("React Developer");
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class multi_thread {
    static void main() {
        Thread t1 = new pqr();
        t1.start();
        Thread t2 = new xyz();
        t2.start();

    }
}
