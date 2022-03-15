package coll;

import java.util.Scanner;

public class Emp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

System.out.println("enter sapid");
int sapid=sc.nextInt();
System.out.println("enter emp name");
sc.nextLine();
String ename=sc.nextLine();
System.out.println("emp gender");
char ch=sc.next().charAt(0);
System.out.println(ename);
System.out.println(sapid);
System.out.println(ch);
	}

}
