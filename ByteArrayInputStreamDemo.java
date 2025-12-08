import java.io.*;

class ByteArrayInputStreamDemo {

public static void main(String args[])
{
  try{

   byte[] buf={35,34,37,38};

   ByteArrayInputStream bout=new ByteArrayInputStream(buf);
   int k=0;

   while((k=bout.read())!=-1)
  {
    char ch=(char)k;
    System.out.println("ASCII values of char is:"+k+ "the special char:"+ch);

   
}
}
 catch(Exception e)
{

   System.out.println(e);
}
  System.out.println("Successfully ....write");
}

}

