import java.util.*;

class TreeSetDemo
{
	public static void main(String args[])
	{
           TreeSet<Integer> t1=new TreeSet<Integer>();
	   t1.add(27);
	   t1.add(87);
	   t1.add(1);
	   t1.add(90);

	System.out.println("TreeSet is:"+t1);

  	t1.pollFirst();
	t1.pollLast();
	System.out.println("after poll :"+t1);

	System.out.println("descending treeset :"+t1.descendingSet());

	System.out.println("HeadSet  :"+t1.headSet(87,true));
	System.out.println("tailSet :"+t1.tailSet(27,false));
	System.out.println("subSet  :"+t1.subSet(27,true,87,true));

	System.out.println("Higher element  :"+t1.higher(1));
	System.out.println("lower element  :"+t1.lower(87));

   }
}