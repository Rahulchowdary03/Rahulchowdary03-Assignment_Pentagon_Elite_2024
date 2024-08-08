package collections;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		
		st.push(14);
		st.push(22);
		st.push(89);
		st.push(34);
		System.out.println(st);
		System.out.println("Poping element");
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
