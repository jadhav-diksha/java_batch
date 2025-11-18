class FinallyDemo
{
  public static void main(String args[])                                   
  {
 
       System.out.println("welcome to exception handling");
       
     try
     {
                 int data=25/0;
                 System.out.println(data);
                
            
    }
     catch(Exception e)                         
     {
          System.out.println(e);
      }

  finally{
          
            System.out.println("finally block always execute");

     }

     System.out.println("reset of the code my program");
   }
}
