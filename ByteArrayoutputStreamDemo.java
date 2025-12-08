import java.io.*;

class ByteArrayoutputStreamDemo {

public static void main(String args[])
{
  try{

   FileOutputStream fis1=new FileOutputStream("C:\\java class\\java_batch\\FilesData\\test1.txt");
   FileOutputStream fis2=new FileOutputStream("C:\\java class\\java_batch\\FilesData\\test2.txt");
   FileOutputStream fis3=new FileOutputStream("C:\\java class\\java_batch\\FilesData\\test3.txt");

   ByteArrayOutputStream bout=new ByteArrayOutputStream();
   bout.write(65);

   bout.writeTo(fis1);
   bout.writeTo(fis2);
   bout.writeTo(fis3);

   bout.flush();
   bout.close();
  
  }
 catch(Exception e)
{

   System.out.println(e);
}
  System.out.println("Successfully ....write");
}

}

