import java.util.*;

class LinkedListDemo {

 public static void main(String args[])
 {
   LinkedList<String> l1=new LinkedList<String>();
   l1.add("diksha");
   l1.add("Krushna");
   l1.add("gauri");
   l1.add("sahil");
   l1.add("saloni");

   l1.addFirst("sanika");  //add element at first position

   l1.addLast("minal");  //add element at last position


  l1.push("naina"); //add element at first position

  System.out.println("linked list is:"+l1);

  System.out.println("element at index 5:"+l1.get(6)); //display element of index position

  System.out.println("element first:"+l1.getFirst()); //get first element

  System.out.println("element last:"+l1.getLast()); //get last element

   System.out.println("element peek:"+l1.peek());

  System.out.println("element peekFirst:"+l1.peekFirst());
 
 System.out.println("element peekLast:"+l1.peekLast());

}

}