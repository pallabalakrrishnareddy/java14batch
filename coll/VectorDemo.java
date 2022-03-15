package coll;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Number> v=new Vector<>();
		v.add(45);
		v.add(90.675);
		v.add(56.89);
		v.add(90.675);
		System.out.println("ouput based on SOP stamt");
		System.out.println(v);
		System.out.println("ouput based on Enumeration stamt");
		Enumeration<Number> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+"\t");
		}
		System.out.println("\n ouput based on Iterator stamt");
		Iterator<Number>it =v.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}
		System.out.println("\n ouput based on ListIterator forword dir");
		ListIterator<Number> li=v.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+"\t");
		}
		System.out.println("\n ouput based on ListIterator backword dir");
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+"\t");
		}
		System.out.println("\n ouput based on for loop");
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+"\t");
		}
		System.out.println("\n ouput based on for each loop");
		for(Number t:v)
		{
			System.out.print(t+"\t");
		}
	}

}
