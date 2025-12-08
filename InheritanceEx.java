class Vehicle {


void show(){

System.out.println("values of n");

}
}
class Car extends Vehicle
{
  void show() {

    System.out.println("this is car class");
  }
}

public class InheritanceEx{

 public static void main(String args[])
{
  Car c=new Car();
  c.show();
}
}