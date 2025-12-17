import java.util.*;

class PersonInfo {

   int id;
   String name;
   int age;
   String city;

PersonInfo(int id,String name,int age,int city)
{
	this.id=id;
	this.name=name;
	this.age=age;
	this.city=city;
}
}


public class TestPersonList {

public static void main(String args[])
{
	
PersonInfo p1=new PersonInfo(101,"diksha",22,"pune");
PersonInfo p2=new PersonInfo(102,"gauri",23,"dhaund");
//PersonInfo p3=new PersonInfo(103,"diksha",22,"pune");

ArrayList<PersonInfo> l1=new ArrayList<PersonInfo>();
l1.add(p1);
l1.add(p2);

Iterator itr=l1.iterator();

While(itr.hasNext())
{
 PersonInfo p=(PersonInfo)itr.next();

System.out.println(p.id+" "+p.name+" "+p.age+" "+p.city);
}

}
}