public class DaemonThread extends Thread {

    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
        System.out.println("Thread daemon executed");
        }
        else{
         
            System.out.println("Thread user executed");
        }
    }

    public static void main(String args[])
    {
        DaemonThread t1=new DaemonThread();
        DaemonThread t2=new DaemonThread();
        DaemonThread t3=new DaemonThread();

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

        System.out.println(Thread.currentThread().getName()+"Ends");
    }
    
}
