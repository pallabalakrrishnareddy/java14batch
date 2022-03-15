package excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=0;
	try
	{
		System.out.println("enter 2 int no");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	catch(InputMismatchException ie)
	{
	ie.printStackTrace();
	}
	try
	{
		System.out.println("sum="+(a+b));
		System.out.println("div="+(a/b));
	}
	catch(ArithmeticException ae)
	{
		ae.printStackTrace();
	}
		System.out.println("sub="+(a-b));
		System.out.println("mul="+(a*b));
		int marks[]=new int[5];
		try
		{
		marks[3]=56;
		System.out.println(marks[3]);
		
	}
		catch(ArrayIndexOutOfBoundsException anurag)
	{
		anurag.printStackTrace();
	}
		System.out.println("program exe completed");
	
	
	}
}
