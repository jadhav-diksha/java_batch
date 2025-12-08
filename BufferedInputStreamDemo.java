import java.io.*;

class BufferedInputStreamDemo {

public static void main(String args[])
{
  try{

   FileInputStream fis=new FileInputStream("C:\\java class\\java_batch\\FilesData\\test.txt");

   BufferedInputStream bis=new BufferedInputStream(fis);

   int i;
   while((i=bis.read())!=-1)
   {
    System.out.print((char)i);
   }

   bis.close();
   fis.close();
  }
 catch(Exception e)
{

   System.out.println(e);
}
 
}

}

