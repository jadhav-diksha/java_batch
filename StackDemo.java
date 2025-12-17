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
	
	System.out.println("top of stack :"+st.peek());


	st.pop();
	
	System.out.println("element of stack after pop :"+st);

	st.push(898);
	
	System.out.println("element of stack after push :"+st);

	System.out.println("Top of stack:" +st.peek());

       System.out.println("search element :"+st.search(54));

	

   }
}