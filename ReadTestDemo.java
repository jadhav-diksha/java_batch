import java.io.*;

class ReadTestDemo {
 
	public static void main(String args[])  
	{
		try {
			File f1=new File("C:\\java class\\java_batch\\FilesData\\sample.txt");

		if(f1.createNewFile())
		{
			System.out.println(f1.getName()+ "is created");
		}
		else
		{
		  System.out.println("already created");
		}
       
		System.out.println("IS File Readble :"+f1.canRead());
		System.out.println("IS File writable :"+f1.canWrite());
		System.out.println("IS File excutable :"+f1.canExecute());

		f1.setReadable(false);
		f1.setWritable(false);
		f1.setExecutable(true);

		System.out.println("IS File Readble :"+f1.canRead());
                System.out.println("IS File writable :"+f1.canWrite());
		System.out.println("IS File excutable :"+f1.canExecute());


              }
		catch(Exception e) {
		
			System.out.println(e);
	
		     }
   
         }
}