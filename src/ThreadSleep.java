public class ThreadSleep extends Thread{

    public  void run()
    {
        try 
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(i+"th Thread is running");
                Thread.sleep(1000); // Sleep for 1 second

            }

        }
        catch (InterruptedException e) 
        {
            System.out.println("Thread was interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        ThreadSleep t1=new ThreadSleep();
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}