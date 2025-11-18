import java.io.*;

class ThrowsDemo
{
 void show() throws IOException
 {
   
  System.out.println("throws example");

 }
}

 class ThrowsTest{

 public static void main(String args[])
 {

   ThrowsDemo d1=new ThrowsDemo();

   try
   {
   d1.show();
  
  }catch(Exception e)             
  {
  System.out.println(e);
  }

}

}


