class MultipleCatchBlockDemo
{
  public static void main(String args[])
  {

       
     try
     {
                 int []a =new int[5];
                 a[6]=100/50;
 
                 String s=null;

                System.out.println(s.length());
      }

      catch(ArithmeticException e)                         
     {
          System.out.println(e);
      }

      catch(ArrayIndexOutOfBoundsException e)                         
     {
          System.out.println(e);
      }

       catch(Exception e)                         
     {
          System.out.println(e);
      }


     System.out.println("reset of the code my program");
   }
}

