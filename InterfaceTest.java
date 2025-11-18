interface MyInterface{

default void show()
{
printDetails();
System.out.println("use to show message");
}

default void display()
{
printDetails();
System.out.println("use to display message");
}

private void printDetails()
{
System.out.println("use to print message");
}
}

class privateinterface implements MyInterface
{

}

class InterfaceTest
{
   public static void main(String args[])
  {
    privateinterface p1=new privateinterface();

p1.show();
p1.display();

}
}
