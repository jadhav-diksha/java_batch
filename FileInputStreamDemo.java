import java.io.FileInputStream;

public class FileInputStreamDemo {

    public static void main(String args[])
    {
        try{
          
      		FileInputStream fs=new FileInputStream("C:\\java class\\java_batch\\FilesData\\test.txt");
		
		int i;
		
		while( (i=fs.read()) != -1)
		{
			System.out.println((char)i);
		}
			fs.close();             

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
