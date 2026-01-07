import java.util.*;

class VectorDemo {

  public static void main(String args[])
 {
 	Vector<String> v1=new Vector<String>();
	v1.add("swift");
	v1.add("Tiago");
	v1.add("Harrir");
	v1.add("safari");

	System.out.println(v1);	
        v1.addElement("sierra");
        System.out.println(v1.firstElement());
	System.out.println(v1.lastElement());
	System.out.println(v1.elements());
	System.out.println(v1.elementAt(4));
         System.out.println(v1.removeElement("swift"));
        v1.removeElementAt(3);
        System.out.println("after removeelementAt:"+v1);
        System.out.println("capacity of element :"+v1.capacity());
        System.out.println("size of element :"+v1.size());
        System.out.println("Index of element :"+v1.indexOf("safari"));
        System.out.println("remove of element :"+v1.remove(1));
        v1.set(0,"venue");
	System.out.println("set element :"+v1);
        System.out.println("get element :"+v1.get(0));
        System.out.println("Is Emptyelement :"+v1.isEmpty());
        System.out.println("sublist element:"+v1.subList(0,1));
        System.out.println("Array of element:"+v1.toArray());
        v1.ensureCapacity(20);
        System.out.println("Capacity after ensureCapacity(20): " + v1.capacity()); // ≥ 20

 }
}






// capacity() size() indexof() remove() add() set() get() isEmpty() sublist() toArray()	