public class ArithException extends Thread {

public void run()
{
  try{
       int a=10,b=0;
	
      System.out.println(a/b);
	      
    }catch(ArithmeticException e){

        System.out.println(e);

    }
}

public static void main(String args[])
{
ArithException t1=new ArithException();
t1.start();
}
    
}
