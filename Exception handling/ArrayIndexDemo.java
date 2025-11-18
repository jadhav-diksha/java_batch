class ArrayIndexDemo
{
  public static void main(String args[])
  {

        int[] a={10,20,30,40};

       System.out.println("welcome to exception handling");

     try
     {
         int i=10;        //a[8]=50;
         System.out.println(a[i]); 
      }

      catch(Exception e)                         
     {
          System.out.println(e);
      }

     System.out.println("reset of the code my program");
   }
}



//welcome to exception handling
//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4
//reset of the code my program