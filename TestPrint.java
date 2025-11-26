class printdetails {

    public static synchronized void printMessage(String s)
    {
      for(int i=1;i<=5;i++)
        {
            System.out.println("good night...");
             System.out.println(s);

            try{

                Thread.sleep(1000);
            
            }catch(Exception e)
            {
                 System.out.println(e);
            }
        }
    }
    
}

class MyThread1 extends Thread{

    printdetails d;

    String s;

    MyThread1(printdetails d,String s)
    {
        this.d=d;
        this.s=s;
    }
    public void run()
    {
        d.printMessage(s);
    }
}

public class TestPrint{

    public static void main(String args[])
    {
        printdetails obj=new  printdetails();
        printdetails obj1=new  printdetails();
       
       MyThread1 t1=new MyThread1(obj,"diksha");
        MyThread1 t2=new MyThread1(obj1,"sachin");

       t1.start();
       t2.start();

    }
}
