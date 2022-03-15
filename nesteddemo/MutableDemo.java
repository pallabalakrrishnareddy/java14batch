package nesteddemo;

import java.util.Scanner;

public class MutableDemo {

	public static void main(String[] args) {
		String s1="ci3 Technologies";
		StringBuilder sb=new StringBuilder(s1);
		System.out.println(sb);
		System.out.println(sb.replace(0,3,"hcl"));
		System.out.println(sb);
		System.out.println(sb.reverse());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String s=sc.nextLine();
		StringBuilder sb1=new StringBuilder(s);
		System.out.println("Reverse of the string is "+sb1.reverse());
	}
}
