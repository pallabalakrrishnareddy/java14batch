package oops;

import java.util.Scanner;

public class BikeRider {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter model u wanted ");
		String s1=sc.nextLine();
		System.out.println("enter mil u wanted ");
		int mil=sc.nextInt();
		System.out.println("enter cc u wanted ");
		int cc=sc.nextInt();
		System.out.println("enter col u wanted ");
		String s2=sc.next();
		System.out.println("enter expected price ");
		double price=sc.nextDouble();
	//Bike b2=new Bike("ktm2020",45,250,"Red",175000.00);
		Bike b2=new Bike(s1,mil,cc,s2,price);
System.out.println(b2);
	}

}
