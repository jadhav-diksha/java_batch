import java.util.*;
class ArrayListSortMethod{
	public static void main(String args[])
	{
		ArrayList l1=new ArrayList();
		l1.add(80);
		l1.add(20);
		l1.add(50);
		l1.add(40);
		
		System.out.println("original list:"+l1);
		Collections.sort(l1);
	       System.out.println("Sorted List:"+l1);
	}
}