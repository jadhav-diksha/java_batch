//Write a Java program using Encapsulation where a Person class has private variables name and age.
//Use getters and setters to access them.


class Person {
  
Private String name;
Private int age;

public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public void setAge(int age)
{
this.age=age;
}
public int getAge()
{
return age;
}

public static void main(String args[])
{
Person p1=new Person();
p.setName("diksha");
p.setAge(22);

System.out.println("Name is:" +p.getName());
System.out.println("Age is:" +p.getAge());
}
}
