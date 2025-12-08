import java.io.*;

class DataInputStreamDemo {

public static void main(String args[])
{
  try{

   FileInputStream fin=new FileInputStream("C:\\java class\\java_batch\\FilesData\\test1.txt");
  
   DataInputStream din=new DataInputStream(fin);

  int cnt=fin.available();

  byte[] arr=new byte[cnt];

  din.read(arr);

  for(byte bt:arr)
  {
    char k=(char)bt;
    System.out.print(k+"-");
  }
  }
 catch(Exception e)
{

   System.out.println(e);
}
  System.out.println("Successfully ....write");
}

}

