import java.io.File;
import java.io.IOException;

class FileDemo {

	public static void main(String args[])
	{
		try{
			File f1=new File("C:\\java class\\java_batch\\FilesData\\sample.txt");
			if(f1.createNewFile())
			{
				System.out.println("File"+f1.getName()+" is created");
			}
			else
			{
				System.out.println("file already exits");
			}

			System.out.println("path of file:"+f1.getAbsolutePath());
			System.out.println("Do you have permission to read:"+f1.canRead());
			System.out.println("Do you have permission to write:"+f1.canWrite());
			System.out.println("length of file:"+f1.length());


			if(f1.delete())
			{
				System.out.println("File"+f1.getName()+" is deleted ");
			}
			else
			{
				System.out.println("error");
			}


		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}