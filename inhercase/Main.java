package inhercase;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("select one choice");
System.out.println("1.cust");
System.out.println("2.Emp");
System.out.println("enter choice");
int choice=sc.nextInt();
switch(choice)
{
case 1:
{
	System.out.println("enter name");
	sc.nextLine();
	String name=sc.nextLine();
	System.out.println("enter DOB");
	String Dob=sc.nextLine();
	System.out.println("enter gender");
	String gender=sc.nextLine();
	System.out.println("enter Mobile number");
	String mobilenumber=sc.nextLine();
	Cust c1=new Cust(name,Dob,gender,mobilenumber);
	c1.display();
	break;
}
case 2:
{
	System.out.println("enter name");
	sc.nextLine();
	String name=sc.nextLine();
	System.out.println("enter DOB");
	String Dob=sc.nextLine();
	System.out.println("enter gender");
	String gender=sc.nextLine();
	System.out.println("enter Mobile number");
	String mobilenumber=sc.nextLine();
	System.out.println("enter empid");
	int empid=sc.nextInt();
	System.out.println("enter emp sal");
	double sal=sc.nextDouble();
	BankEmp  e1=new BankEmp(name,Dob,gender,mobilenumber,empid,sal);
	e1.empDeatilsInfo();	
	break;
}
default:
	System.out.println("invalid choice");
}

}
}