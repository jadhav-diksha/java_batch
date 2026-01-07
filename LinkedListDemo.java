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
   System.out.println("element remove :"+l1.remove());
   System.out.println("element remove :"+l1.remove(2));
   System.out.println("element removeFirst :"+l1.removeFirst());
   System.out.println("element removeLast :"+l1.removeLast());
   System.out.println("element poll :"+l1.poll());
   System.out.println("element poll first :"+l1.pollFirst());
   System.out.println("element poll last :"+l1.pollLast());
   System.out.println("element offer :"+l1.offer("prajkata"));
   System.out.println("element offer First :"+l1.offerFirst("kajal"));
   System.out.println("element offer Last :"+l1.offerLast("vish"));
   System.out.println("linked list is:"+l1);
   LinkedList<String> clonedList = (LinkedList<String>) l1.clone();
   System.out.println("Cloned linked list: " + clonedList);
   clonedList.add("reshma");
System.out.println("After modifying cloned list:");
System.out.println("Original linked list: " + l1);
System.out.println("Modified cloned list: " + clonedList);
}

}



