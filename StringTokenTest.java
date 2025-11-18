import java.util.*;

class StringTokenTest
{
  public static void main(String args[])
  {
         String s1="have a nice day dear all";    //default seperator(space)

         StringTokenizer st=new StringTokenizer(s1);

        while(st.hasMoreTokens())

      {
          System.out.println(st.nextToken());

      }
   }
}