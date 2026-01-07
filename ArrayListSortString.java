import java.util.*;

class ArrayListSortString{

	public static void main(String args[])
	{

		ArrayList l1=new ArrayList();
		l1.add(80);
		l1.add(20);
		l1.add(50);
		l1.add(40);

		ArrayList l2=new ArrayList();
		l2.add("diksha");
		l2.add("saloni");
		l2.add("nikita");
		l2.add("gauri");
		
		System.out.println("original list:"+l2);

		Collections.sort(l2); //string will acsending and desc

	       System.out.println("Sorted List:"+l2);

		l2.remove("saloni");  // remove the specific element using remove()
		System.out.println(l2);

		l1.addAll(l2); //Add all element in l1 and l2 using addAll()

		System.out.println("after addall:"+l1);

	
		l1.removeAll(l2); //remove all element from l2 using removeAll()

		System.out.println("after removeall 12 element"+l1);

		
		ArrayList l3=new ArrayList();  //check the index of specific integer

		l3.add(10);
		l3.add(56);
		l3.add(72);
		l3.add(77);

		System.out.println("L3 :"+l3);

		System.out.println("index of 71:"+l3.indexOf(72));

		System.out.println("77 is available in list:"+l3.contains(77));

		l1.clear();
		System.out.println("l1 :"+l1);


		
	}
}