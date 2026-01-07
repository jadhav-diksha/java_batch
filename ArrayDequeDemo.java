import java.util.*;

class ArrayDequeDemo
{
	public static void main(String args[])
	{
		ArrayDeque<String> pq=new ArrayDeque<String>();

		pq.add("jadhav");
		pq.add("pawar");
		pq.add("Ghadge");
		pq.add("Bhosale");

		System.out.println(pq);

		pq.offer("suryvanshi");
		System.out.println("Offer  :"+pq);

		pq.offerFirst("mali");
		System.out.println("ArrayDueque offerfirst :"+pq);

		pq.offerLast("kadam");
		System.out.println("offerlast :"+pq);

		pq.remove();
		System.out.println("remove"+pq);
		
		pq.poll();
		System.out.println("poll"+pq);

		pq.pollLast();
		System.out.println("poll Last"+pq);




	}
}
