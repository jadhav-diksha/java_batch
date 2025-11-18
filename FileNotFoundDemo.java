import java.io.FileReader;

class FileNotFoundDemo
{
  public static void main(String args[])
  {

     try
     {
     FileReader fr=new FileReader("missing txt");    // exception FileNotFoundException

     }

      catch(Exception e)                      //java.io.FileNotFoundException: missing txt 
      {
          System.out.println(e);
      }
   }
}