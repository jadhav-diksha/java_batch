import java.io.*;

class WriterDemo {
	
	public static void main(String args[])
	{
	   try {
		
		Writer w=new FileWriter("output.txt");
		String content="I lOVE INDIA \n";
 		w.write(content);
		w.append("i like to travel in china");
		w.close();
		System.out.println("write successfully");
		}
	   catch(Exception e){
		System.out.println(e);
	  }
	}
   }


//explore diffrent method console class and write and read classes,try to prepare their example using chatgpt?			