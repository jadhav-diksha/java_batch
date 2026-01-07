import java.util.*;

class QueueSetDemo
{
	public static void main(String args[])
	{
          HashSet<Integer> hs=new HashSet<Integer>();   //random display  does not maintain any order  allow null value
	  hs.add(23);
	  hs.add(87);
	  hs.add(65);
	  hs.add(null);

       System.out.println("HashSet :"+hs);
  	System.out.println("size is :"+hs.size());
	System.out.println("remove is :"+hs.remove(65));
    	System.out.println("contains is :"+hs.contains(87));
	System.out.println("Is Empty is :"+hs.isEmpty());
	 
	hs.clear();
   
    	System.out.println("clear "+hs);


	LinkedHashSet<Integer> hs1=new LinkedHashSet<Integer>(); //Insertion order  allow null value
	  hs1.add(23);
	  hs1.add(87);
	  hs1.add(65);
	  hs1.add(null);

       System.out.println("LinkedSet :"+hs1);


	TreeSet<Integer> hs2=new TreeSet<Integer>(); //asc order  does not allow null value to store
	  hs2.add(23);
	  hs2.add(87);
	  hs2.add(65);
	  //hs2.add(null);

       System.out.println("TreeSet :"+hs2);

	

	}
}


// add() clear() clone() contains() isEmpty() remove() size()

	  