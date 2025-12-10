import java.util.*;

class InputTestDemo {
 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a message");
		String message=sc.nextLine();
		
		System.out.println("enter your age");
		int age=sc.nextInt();

		System.out.println("enter your salary");
		double salary=sc.nextDouble();

		System.out.println("your message is"+message);
		System.out.println("Age  is"+age);
		System.out.println("salary  is"+salary);


		sc.close();
	}
}