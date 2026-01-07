import java.util.*;

class ArrayListDemo4{
	public static void main(String args[]){

	ArrayList l1=new ArrayList();
	
	l1.add(10);
	l1.add(20);
	l1.add(76);
	l1.add(34);
	
	System.out.println("Display All Elements: "+l1);
        System.out.println("Index Of Element: "+l1.indexOf(76));
        System.out.println("Is present: "+l1.contains(72));
        System.out.println("LastIndex Of Element: "+l1.lastIndexOf(76));
        l1.set(1,90);//Set Method...
        System.out.println("After Set Method: "+l1);
        System.out.println("Using Get Method: "+l1.get(3));
        l1.remove(0);
	System.out.println("After Remove Method: "+l1);
        System.out.println("size Of List: "+l1.size());
        System.out.println("List IsEmpty: "+l1.isEmpty());

	l1.clear();
        System.out.println("After Clear Method: "+l1);
	}
	
}