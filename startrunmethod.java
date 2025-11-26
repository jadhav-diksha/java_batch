public class startrunmethod  extends Thread{

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
       startrunmethod ts=new  startrunmethod();

       startrunmethod ts1=new  startrunmethod();

       
       
       ts.start();
       ts1.start();

    //    ts.run();
    //    ts1.run();
        
    }
    
}





//what is sleep method 
// what is the use join()