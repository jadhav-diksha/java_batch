//Runtime Exception

class NumberFormatDemo
{
  public static void main(String args[])
  {

         String s="Diksha";

       System.out.println("welcome to exception handling");

     try
     {
         int no=Integer.parseInt(s);
         System.out.println(no); 
      }

      catch(Exception e)                         
     {
          System.out.println(e);
      }

     System.out.println("reset of the code my program");
   }
}


//welcome to exception handling
//java.lang.NumberFormatException: For input string: "Diksha"
//reset of the code my program