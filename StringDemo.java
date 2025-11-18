class StringDemo
{ 
  public static void main(String args[])
{

 String s1="Hello";
 String s2="diksha";

System.out.println(s1.concat(s2));  //standard method

String s3=s1+s2;  // using +operator

System.out.println(s3);

System.out.println("length of string " +s3.length());

System.out.println("character At is "+s3.charAt(6));

//substring(startindex,endindex)

System.out.println("substring is " +s3.substring(0,6)); // starting eindex and return data till end of string=(4));

System.out.println("both are equals "+s1.equals(s2));

System.out.println("uppercase "+s1.toUpperCase());

System.out.println("lowercase "+s1.toLowerCase());

s1=String.join(",","I","am","diksha","jadhav","from","satara");

System.out.println(s1);

s2=String.join("::","12","20","12");

System.out.println(s2);

//contains method

String s7="Awesome";

System.out.println(s7.contains("some"));  //true
System.out.println(s7.contains("done"));  //false

//using trim method

String s8="         coding is   ";

System.out.println(s8+"awsome");

System.out.println(s8.trim()+"awsome");

//replace method  replace(oldchar,newchar)

String s9="i am diksha jadhav";
System.out.println(s9.replace('a','i'));


}
}