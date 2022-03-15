package coll;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	int i=1;
	boolean result;
	Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("enter person name:"+i++);
		String pname=sc.nextLine();
		al.add(pname);
		System.out.println("do u wanted to insert more data enter yes or no");
		String ans=sc.nextLine();
		result =ans.equals("yes");
		
	}while(result);
System.out.println("enterd person info");
for(String s1:al)       //unboxing
{
	System.out.print(s1+"\t");
}
	}

}
