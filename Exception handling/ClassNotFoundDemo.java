class ClassNotFoundDemo
{
  public static void main(String args[])
  {

     try
     {
         Class.forName("com.sam.ram");          //java.lang.ClassNotFoundException: com.sam.ram
     }

      catch(Exception e)                         
     {
          System.out.println(e);
      }
   }
}