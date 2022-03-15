package coll;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
	ArrayList<Product> al=new ArrayList<>();
	al.add(new Product(110,"samsung tv",250000));
	al.add(new Product(123,"saunsui tv",450000));
	al.add(new Product(156,"Apple tv",650000));
	al.add(new Product(189,"OnePlus tv",120000));
	al.add(new Product(120,"Nokia tv",125000));
	al.add(new Product(124,"mi tv",900000));
	al.add(new Product(196,"Micromax tv",670000));
	al.add(new Product(100,"Bpl tv",220000));
	System.out.println("Entred product Info");
	for(Product i:al)
	{
		System.out.println(i.getId()+"\t"+i.getPname()+"\t"+i.getPrice());
	}
	System.out.println("custmized Output based on Price");
	 Collections.sort (al,new PriceCompare());
	 System.out.println("Entred product Info");
		for(Product i:al)
		{
			System.out.println(i.getId()+"\t"+i.getPname()+"\t"+i.getPrice());
		}
		System.out.println("custmized Output based on product id");
		 Collections.sort (al,new ProdIdCompare());
		 System.out.println("Entred product Info");
			for(Product i:al)
			{
				System.out.println(i.getId()+"\t"+i.getPname()+"\t"+i.getPrice());
			}
			System.out.println("custmized Output based on product name");
			 Collections.sort (al,new BandComapre());
			 System.out.println("Entred product Info");
				for(Product i:al)
				{
					System.out.println(i.getId()+"\t"+i.getPname()+"\t"+i.getPrice());
				}
	}

}
