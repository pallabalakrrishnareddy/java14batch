package coll;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		System.out.println(st.empty());
		//st.pop();
		st.push(18);    //autoboxing
		st.push(19);
		st.push(20);
		st.push(18);
		st.push(22);
		System.out.println("top="+st.peek());
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.search(19));
		System.out.println("top="+st.peek());
	}

}
