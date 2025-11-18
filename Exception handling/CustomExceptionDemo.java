class DikshaException extends Exception
{
 public DikshaException(String str)
 {
   super(str);

 }
}

public class CustomExceptionDemo{

 public static void main(String args[])
 {

   try{

      throw new DikshaException("this is my custom exception");

  }catch(DikshaException e)

  {
         System.out.println(e);

}

System.out.println("reset the code..");

}
}

//DikshaException: this is my custom exception
//reset the code..