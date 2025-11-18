import java.io.*;

class ThrowDemo1
{
 public static void show() throws FileNotFoundException
 {
   
   FileReader fr=new FileReader("c:\\user\\desktop\\abc.txt");
 
   throw new FileNotFoundException();

 }
 public static void main(String args[])
 {

   try
   {
   show();
  
  }catch(Exception e)             
  {
  System.out.println(e);
  }
  System.out.println("reset of the code,...");

}
}


