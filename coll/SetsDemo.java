package coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(52003640);
		al.add(51887111);
		al.add(51906532);
		al.add(52003647);
		al.add(51887111);
		al.add(51906590);
		al.add(null);
		System.out.println("ArrayList Output");
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}

		HashSet<Integer>hs=new HashSet<>();
		hs.add(52003640);
		hs.add(51887111);
		hs.add(51906532);
		hs.add(52003647);
		hs.add(51887111);
		hs.add(51906590);
		hs.add(null);
		System.out.println("\nHashSet Output");
		Iterator<Integer> it1=hs.iterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next()+"\t");
		}
		LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
		lhs.add(52003640);
		lhs.add(51887111);
		lhs.add(51906532);
		lhs.add(52003647);
		lhs.add(51887111);
		lhs.add(51906590);
		lhs.add(null);
		System.out.println("\nLinked HashSet Output");
		Iterator<Integer> it2=lhs.iterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next()+"\t");
		}
		TreeSet<Integer>ts=new TreeSet<>();
		ts.add(52003640);
		ts.add(51887111);
		ts.add(51906532);
		ts.add(52003647);
		ts.add(51887111);
		ts.add(51906590);
		//ts.add(null);
		System.out.println("\nTreeSet Output");
		Iterator<Integer> it3=ts.iterator();
		while(it3.hasNext())
		{
			System.out.print(it3.next()+"\t");
		}
	}

}
