 class BankAccount {

    int accno;
    String holdername;
    double balance;


 void deposit(double amt)
{
    balance=balance + amt;
}
void withdraw(double amt)
{
    balance = balance - amt;
}

 void showdetails()
 {
    System.out.println("Account no" +accno);
    System.out.println("holdername" +holdername);
    System.out.println("balance " +balance);
 }
}

public class TestAccount
{
    public static void main(String args[])
    {
      BankAccount b1=new BankAccount();
      
      b1.accno=101;
      b1.holdername="diksha";
      b1.balance=7000;

      b1.deposit(3000);
      b1.withdraw(2000);
      b1.showdetails();

    }
    
}

