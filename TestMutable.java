class TestMutable
{
 public static void main(String args[])
{ 
  String s1=new String("diksha");  //immutable string
  s1.concat("Jadhav");

 System.out.println(s1);

StringBuffer sb=new StringBuffer("Hello");  //mutable string

sb.append("diksha");

System.out.println(sb);

}
}