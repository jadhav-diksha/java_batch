class ExceptionHandlingDemo
{
  public static void main(String args[])
  {

       int a=10;
       int b=0;

       System.out.println("welcome to exception handling");

     try
     {
                  System.out.println(a/b); 
      }

      catch(Exception e)                         
     {
          System.out.println(e);
      }

     System.out.println("reset of the code my program");
   }
}

