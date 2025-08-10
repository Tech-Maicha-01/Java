

public class threadExample extends Thread
{
    

    public void run()
    {
        // Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

    }

    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getPriority());
        threadExample t1 = new threadExample();
        threadExample t2 = new threadExample();
        t1.start();
        t2.start();
    }
}