import java.io.*;

class BufferReaderDemo {
	
	public static void main(String args[])
	{
	   try {
		
		Reader r=new FileReader("output1.txt");
		BufferedReader br=new BufferedReader(r);
		int data;
		while((data=br.read())!=-1)
		{
		  System.out.print((char)data);
		}
		br.close();
		r.close();
		
		}
	   catch(Exception e){
		System.out.println(e);
	  }
	}
   }


//explore diffrent method console class and write and read classes,try to prepare their example using chatgpt?			