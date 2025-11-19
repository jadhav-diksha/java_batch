public class ThreadRunnable implements Runnable{

    public void run()
    {
        System.out.println("thread is running");
    }
    public static void main(String args[])
    {
        Runnable r=new ThreadRunnable();
        Thread t2=new Thread(r,"my Thread1");

        //ThreadRunnable r1=new ThreadRunnable(); 
        //Thread t2=new Thread(r1);
        
        t2.start();
        String s1=t2.getName();
        System.out.println(s1);
    }
    
}








