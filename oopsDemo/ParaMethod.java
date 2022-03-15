package oopsDemo;

public class ParaMethod {
	public static void interchange(int x,int y)
	{
		System.out.println("output before swaping");
		System.out.println(x);
		System.out.println(y);
		int z=x;
		x=y;
		y=z;
		System.out.println("output after swaping");
		System.out.println(x);
		System.out.println(y);
		
	}
	public static void swap(int x,int y)
	{
		System.out.println("output before swaping");
		System.out.println(x);
		System.out.println(y);
		x=x+y;  //30
		y=x-y;  //10
		x=x-y;  // 20
		System.out.println("output after swaping");
		System.out.println(x);
		System.out.println(y);
		
	}
}
