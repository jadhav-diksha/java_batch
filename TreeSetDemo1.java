import java.util.*;

class TreeSetDemo1 {
    public static void main(String args[]) {

        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(14);
        t1.add(12);
        t1.add(15);
        t1.add(19);

	  

        System.out.println("TreeSet is: " + t1);

        System.out.println("Ceiling is: " + t1.ceiling(14));
	  System.out.println("Lower is: " + t1.lower(15));

        System.out.println("Floor is: " + t1.floor(14));
	 System.out.println("Higher is: " + t1.higher(14));

	    }
}
