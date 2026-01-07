import java.util.*;

class MapDemo 
{
    public static void main(String args[]) {

	HashMap m1=new HashMap();
	m1.put(1,"diksha");
	m1.put(2,"gauri");
	m1.put(3,"sanika");
	m1.put(4,"nikita");

	System.out.println(m1);

	Set s=m1.entrySet();
	
	Iterator itr=s.iterator();

	while(itr.hasNext())
	{
	 Map.Entry entry=(Map.Entry)itr.next();
	 System.out.println(entry.getKey()+" "+entry.getValue());
	}


	LinkedHashMap l1=new LinkedHashMap();
	l1.put(1,"diksha");
	l1.put(2,"gauri");
	l1.put(3,"sanika");
	l1.put(4,"nikita");

	System.out.println(l1);

	Set s1=l1.entrySet();
	
	Iterator itr1=s.iterator();

	while(itr1.hasNext())
	{
	 Map.Entry entry=(Map.Entry)itr1.next();
	 System.out.println(entry.getKey()+" "+entry.getValue());
	}


	TreeMap t1=new TreeMap();
	t1.put(1,"diksha");
	t1.put(2,"gauri");
	t1.put(3,"sanika");
	t1.put(4,"nikita");

	System.out.println(t1);

	Set s2=t1.entrySet();
	
	Iterator itr2=s.iterator();

	while(itr2.hasNext())
	{
	 Map.Entry entry=(Map.Entry)itr2.next();
	 System.out.println(entry.getKey()+" "+entry.getValue());
	}

	t1.remove(4);   //remove the specific character
	System.out.println(t1);

	System.out.println(t1.keySet()); // display only key

	System.out.println("key 4 is exits :"+t1.containsKey(4));

	System.out.println("key 4 is exits :"+t1.containsValue("diksha"));

	System.out.println("Get(2) :"+t1.get(2));

	t1.replace(3,"vaishu");
	System.out.println("replace"+t1);


   }
}
