class StringIndexOutOfBoundDemo
{
  public static void main(String args[])
  {

       String a="diksha";
       System.out.println("welcome to exception handling");

     try
     {
                  System.out.println(a.charAt(8)); 
      }

      catch(Exception e)                         
     {
          System.out.println(e);
      }

     System.out.println("reset of the code my program");
   }
}


//welcome to exception handling
//java.lang.StringIndexOutOfBoundsException: Index 8 out of bounds for length 6
//reset of the code my program