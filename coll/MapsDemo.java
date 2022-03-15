package coll;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Hashtable;

public class MapsDemo {

	public static void main(String[] args) {
		Hashtable <Number,String> hm=new Hashtable<>();
		hm.put(1234,"Aaditya");
		hm.put(1267,"Koshangi");
		hm.put(1234,"Mohit Khatri");
		hm.put(1234,"Daksh Jain");
		hm.put(1239,"Koshangi");
		hm.put(1245,"Sai");
		//hm.put(null,"Daksh");
		//hm.put(1358,null);
		System.out.println(hm);

	}

}
