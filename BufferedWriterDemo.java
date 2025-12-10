import java.io.*;

class BufferedWriterDemo {
	
	public static void main(String args[])
	{
	   try {
		
		Writer w=new FileWriter("output1.txt");
		BufferedWriter bw=new BufferedWriter(w);
		String content="I lOVE INDIA \n";
 		bw.write(content);
		
		bw.close();
		System.out.println("write successfully");
		}
	   catch(Exception e){
		System.out.println(e);
	  }
	}
   }


//explore diffrent method console class and write and read classes,try to prepare their example using chatgpt?			