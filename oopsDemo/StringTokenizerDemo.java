package oopsDemo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any String");
	String s1=sc.nextLine();
	StringTokenizer st=new StringTokenizer(s1);
	System.out.println(st.countTokens());
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken(","));
	}
	}

}
