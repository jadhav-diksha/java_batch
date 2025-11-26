public class ThreadPriority extends Thread {

    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        ThreadPriority t1=new ThreadPriority();
         ThreadPriority t2=new ThreadPriority();
          ThreadPriority t3=new ThreadPriority();

          System.out.println(t1.getPriority());
          System.out.println(t2.getPriority());
          System.out.println(t3.getPriority());

          t2.setPriority(8);
           t1.setPriority(3);
            t3.setPriority(9);

            System.out.println(t1.getPriority());
          System.out.println(t2.getPriority());
          System.out.println(t3.getPriority());

          System.out.println(Thread.currentThread().getName());
           System.out.println(Thread.currentThread().getPriority());

           Thread.currentThread().setPriority(10);
            System.out.println(Thread.currentThread().getPriority());

        t1.start();
        t2.start();
        t3.start();

        t1.setName("diksha");
        t2.setName("nikita");
        t3.setName("gauri");
    }
    
}



