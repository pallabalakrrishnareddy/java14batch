package oops;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp name,sal,gen,sapid");
		Emp e1=new Emp();
		e1.setName(sc.next());
		e1.setSal(sc.nextDouble());
		e1.setGen(sc.next().charAt(0));
		e1.setSapid(sc.nextInt());
		e1.display();
		/*String ename=sc.next();
		double sal=sc.nextDouble();
		char gen=sc.next().charAt(0);
		int sapid=sc.nextInt();
		Emp e1=new Emp();
		e1.setName(ename);
		e1.setSal(sal);
		e1.setGen(gen);
		e1.setSapid(sapid);
		e1.display();*/
	}

}
