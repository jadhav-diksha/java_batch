//Runtime Exception

class NullPointerDemo
{
  public static void main(String args[])
  {

         String s=null;

       System.out.println("welcome to exception handling");

     try
     {
         System.out.println(s.length()); 
      }

      catch(Exception e)                         
     {
          System.out.println(e);
      }

     System.out.println("reset of the code my program");
   }
}



//welcome to exception handling
//java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
//reset of the code my program