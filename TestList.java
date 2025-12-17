import java.util.*;
class TestList {

  public static void main(String args[])
  {
	ArrayList a1=new ArrayList();
	a1.add(101);
	a1.add("diksha");
	a1.add("Jadhav");
	a1.add("satara");
	a1.add("satara");

	a1.add(1,"reshma"); //a1.add(int index,element) //only add the name 
	a1.add(0,1000); // add element at specific position

	ArrayList a2=new ArrayList();
	a2.add("krishna");
	a2.add("pune");
	a2.add(3000);

     	a1.add(a2); //adding data from another collection

	System.out.println(a1);

	Iterator itr=a1.iterator();
	while(itr.hasNext())
	{
	 System.out.println(itr.next());
	}

	a1.set(6,"pune"); //replace element at specific position
	System.out.println(a1);
  }
}