import java.util.*;

class StackDemo {
 
   public static void main(String args[]) 
   {
	Stack<Integer> st=new Stack<Integer>();

	Boolean res=st.empty();

	System.out.println("is stack empty :"+res);

	st.push(5);
	st.push(76);
	st.push(54);
	st.push(23);

	 
	System.out.println("element of stack :"+st);

   }
}