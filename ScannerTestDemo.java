import java.util.*;

class ScannerTestDemo {
	
	public static void main(String args[])
        {
 		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		
		//System.out.println("enter your name again:");
		//String n1=sc.nextLine();

		System.out.println("your name is:" +name);
		//System.out.println("your name again:" +n1);

        }
}