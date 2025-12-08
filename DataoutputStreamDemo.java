import java.io.*;

class DataoutputStreamDemo {

public static void main(String args[])
{
  try{

   FileOutputStream fout=new FileOutputStream("C:\\java class\\java_batch\\FilesData\\test1.txt");
  
   DataOutputStream dout=new DataOutputStream(fout);

   dout.write(65);

   dout.flush();
   dout.close();
  
  }
 catch(Exception e)
{

   System.out.println(e);
}
  System.out.println("Successfully ....write");
}

}

