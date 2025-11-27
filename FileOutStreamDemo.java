import java.io.FileOutputStream;

public class FileOutStreamDemo {

    public static void main(String args[])
    {
        try{
          
      		FileOutputStream fs=new FileOutputStream("C:\\java class\\java_batch\\FilesData\\test.txt");
		String s="Welcome to Programming";
		byte b[]=s.getBytes();
 		fs.write(b);
		fs.close();
		System.out.println("successfully.........");
             

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
