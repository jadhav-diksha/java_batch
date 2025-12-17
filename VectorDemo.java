import java.util.*;

class VectorDemo {

  public static void main(String args[])
 {
 	Vector<String> v1=new Vector<String>();
	v1.add("swift");
	v1.add("Tiago");
	v1.add("Harrir");
	v1.add("safari");

	v1.addElement("sierra");

	System.out.println(v1.firstElement());
	System.out.println(v1.lastElement());
	System.out.println(v1.elements());
	System.out.println(v1.elementAt(4));

	System.out.println(v1.removeElement());
	System.out.println(v1.removeElementAt(3));

	System.out.println(v1);	

 }
}


// capacity() size() indexof() remove() add() set() get() isEmpty() sublist() toArray()	