public class ThreadStart2  extends Thread{

    public void run()
    {
        System.out.println("Thread executed");

    }
    public static void main(String args[])
    {
       ThreadStart2 ts=new  ThreadStart2();

       //ts.run();   //when we us direct run method 
       
       ts.start();
       //ts.start();
        
    }
    
}


