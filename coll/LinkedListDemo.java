package coll;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<Laptop> ll=new LinkedList<>();
	ll.add(new Laptop(4,"hp5409",85000.50));
	ll.add(new Laptop(2,"Dell",25000.50));
	ll.add(new Laptop(8,"hp5409",95000.50));
	ll.add(new Laptop(16,"hp5409",125000.50));
	System.out.println(ll);
	ll.add(1, new Laptop(1,"lenv",5000.50));
	Laptop l6=new Laptop(2,"lenv",8000.50);
	Laptop l9=new Laptop(20,"lenv",145000.50);
	ll.addFirst(l6);
	ll.addLast(l9);
	System.out.println(ll);
	}

}
