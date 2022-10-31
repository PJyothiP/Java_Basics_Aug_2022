package Collections;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		
		st.push("Vassvik");
		st.push("Shivansh");
		st.push("Yognavi");
		st.push("Yognavi");
		st.push("Varshi");
		
		System.out.println(st);
		
		
		st.pop();
		System.out.println("stack elements after pop : "+st);
		
		System.out.println("searching for Yognavi : "+st.search("Yognavi"));
		
		System.out.println("The next element that is to be processed is : "+st.peek());
		
		System.out.println("Before clear is the stack empty : "+st.isEmpty());
		st.clear();
		
		System.out.println("Is the stack empty : "+st.isEmpty());
		
	}

}
