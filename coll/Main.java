package coll;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		ArrayList<User>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter the number of users:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the details of user :"+i);
			sc.nextLine();
			String s=sc.nextLine();
			String arr[]=s.split(",");
			User u=new User(arr[0],arr[1],arr[2],arr[3]);
			al.add(u);
		}
		FileWriter fw=new FileWriter("output.CSV");
		BufferedWriter bw=new BufferedWriter(fw);
		UserBo.writeFile(al,bw);
	}

}
