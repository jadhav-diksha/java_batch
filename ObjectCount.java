class Employee {

static int cnt=0;


 Employee()
{
cnt++;
}
}
public class ObjectCount {

public static void main(String args[])
{
 Employee e=new Employee();
 Employee e1=new Employee();
 Employee e3=new Employee();

System.out.println("employee count is :"+Employee.cnt);

}
}