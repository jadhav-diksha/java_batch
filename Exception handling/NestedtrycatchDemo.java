class NestedtrycatchDemo
{
  public static void main(String args[])                                   
  {
 
       System.out.println("welcome to exception handling");
       
     try
     {
                 int []a =new int[5];
                
             try{
                     a[7]=30/5;

                }catch(ArithmeticException e)

                 {
                System.out.println(e);
              }

               String s=null;
               System.out.println(s.length());

    }
     catch(Exception e)                         
     {
          System.out.println(e);
      }


     System.out.println("reset of the code my program");
   }
}
