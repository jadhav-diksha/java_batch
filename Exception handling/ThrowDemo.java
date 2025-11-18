class ThrowDemo
{
 public static void validate(int age)
 {
   if(age<18)
   {
       throw new NullPointerException("this person in not allowd to vote");
   }
   else
  {

    System.out.println("valid voting age");
 }
 }
 public static void main(String args[])
 {

   try
   {
   validate(14);
  
  }catch(Exception e)             // using try block output java.lang.NullPointerException: this person in not allowd to vote
                                        //   reset of the code,...
  {
  System.out.println(e);
  }
  System.out.println("reset of the code,...");

}
}



//how to raise in exception forucfully in java program

//without using try block
//Exception in thread "main" java.lang.NullPointerException: this person in not allowd to vote
   //     at ThrowDemo.validate(ThrowDemo.java:7)
   //     at ThrowDemo.main(ThrowDemo.java:17)