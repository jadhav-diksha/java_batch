// create a invalidAgeException for validating voting age of user? Raise that exception and handle and print details.


class InvalidAgeException extends Exception
{
 public InvalidAgeException(String msg)
 {
  super(msg);

}
}

 public class CustomExceptionDemo1{

 public static void validate(int age) throws InvalidAgeException
 {
 if(age<18)
   {
       throw new InvalidAgeException("this person in not allowd to vote");
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
      validate(15); 
    
  }catch(Exception e)             
  {
  System.out.println(e);
  }
  System.out.println("reset of the code,...");

}
}


