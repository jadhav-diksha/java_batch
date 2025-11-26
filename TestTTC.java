 class Customer {

    int amount=1000;

    synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw..");
		if(this.amount<amount)
		{
			System.out.println("Less Balance,waiting for deposit...");
			try{wait();}catch(Exception e){System.out.println(e);}
		}
        this.amount-=amount;
        System.out.println("withdrawal completed");
	}
    synchronized void deposit(int amount)
    {
      System.out.println("going to deposit");
	   this.amount+=amount;
      System.out.println("withdrawl completd");
      notify();
  
    }
}
public class TestTTC{

  public static void main(String args[])
  {
    final Customer c=new Customer();

    new Thread(){
      public void run()
      {
        c.withdraw(15000);
      }
    }.start();


    new Thread(){
      public void run()
      {
        c.deposit(10000);
      }
    }.start();
  }
}

    

