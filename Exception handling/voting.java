class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}


public class Voting 
{
public static void main(String args[])
{
 
 int age=21;

try{


  if(age<18){
throw new InvalidAgeException("Not eligible for voting");
}
else{

   System.out.println("eligible for  voting");
}
}catch(InvalidAgeException e)
{
System.out.println(e.getMessage());
}
 
}
}