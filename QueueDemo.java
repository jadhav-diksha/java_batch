import java.util.*;
class QueueDemo
{
	public static void main(String args[])
	{
		PriorityQueue<String> pq=new PriorityQueue<String>();

		pq.add("Mango");
		pq.add("Apple");
		pq.add("Banana");
		pq.add("grapes");

		pq.offer("orange");

		System.out.println(pq);

		System.out.println("Head of queue :"+pq.peek());

		System.out.println("Head of queue :" +pq.element());

		pq.poll();

		System.out.println(pq);

		pq.remove();
		System.out.println(pq);

	}
}