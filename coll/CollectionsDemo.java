package coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsDemo {

public static void main(String[] args) {
ArrayList<String > al=new ArrayList<>();
al.add("java");
al.add("pega");
al.add("testing");
al.add("Spring");
al.add(2,"c lan" );
System.out.println(al);
Collections.reverse(al);
System.out.println(al);
Collections.sort(al);
System.out.println(al);
Collections.shuffle(al);
System.out.println(al);
Collections.swap(al, 1, 3);
Iterator<String> it=al.iterator();
while(it.hasNext())
{
	System.out.print(it.next()+"\t");
}
	
	}

}
