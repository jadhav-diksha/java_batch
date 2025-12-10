import java.io.Console;

class ReadTest {

   public static void main(String args[])
   {
	Console c=System.console();
        System.out.println("enter your name:");
	String name=c.readLine();

	System.out.println("enter your password:");
	char[] ch=c.readPassword();

	String pass=String.valueOf(ch);

        System.out.println("welcome "+name);
	System.out.println("your password is "+pass);

   }
}