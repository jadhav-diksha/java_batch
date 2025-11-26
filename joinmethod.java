public class joinmethod extends Thread{

    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try{
                Thread.sleep(300);
            }catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
        
    }
    public static void main(String args[])
    {
       joinmethod t1=new  joinmethod();

       joinmethod t2=new  joinmethod();

       joinmethod t3=new  joinmethod();

       System.out.println("name of thread1 :" +t1.getName());
       System.out.println("name of thread1 :" +t2.getName());
       System.out.println("name of thread1 :" +t3.getName());
       
       
       t1.start();
       t2.start();
       t3.start();

       t1.setName("Diksha");
       


       System.out.println("name of thread1 :" +t1.getName());
       System.out.println("name of thread1 :" +t2.getName());
       System.out.println("name of thread1 :" +t3.getName());
       
       
       try{
        t1.join();
       }catch(Exception e)
       {
        System.out.println(e);
       }
       t2.start();
       t3.start();

        
    }
    
}










