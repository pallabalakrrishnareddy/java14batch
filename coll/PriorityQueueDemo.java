package coll;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements");
		PriorityQueue <String> pq=new PriorityQueue<>();
		pq.add(sc.nextLine());
		pq.add(sc.nextLine());
		pq.add(sc.nextLine());
		pq.add(sc.nextLine());
		pq.add(sc.nextLine());
		pq.add(sc.nextLine());
		System.out.println("Entred Elements");
		for(String j:pq)
		{
			System.out.println(j);
		}
	}

}
