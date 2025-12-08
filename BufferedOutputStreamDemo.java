import java.io.*;

public class BufferedOutputStreamDemo {

public static void main(String args[])
{
  try{

   FileOutputStream fs=new FileOutputStream("C:\\java class\\java_batch\\FilesData\\test.txt");

   BufferedOutputStream bs=new BufferedOutputStream(fs);

   String s="Welcome to bufferedoutput";
   byte b[]=s.getBytes();
   bs.write(b);
   bs.flush();
   bs.close();
   fs.close();
  }
 catch(Exception e)
{

   System.out.println(e);
}
 System.out.println("file successfully");
}

}

//write difference between fileoutputstream and bufferedoutputstream ?
 
//fileinputstream and bufferedinputstream?