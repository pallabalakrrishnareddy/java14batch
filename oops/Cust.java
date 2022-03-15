package oops;
public class Cust {
	public static void main(String[] args) {
		Laptop c1=new Laptop();
		c1.model="Hp1290";
		c1.hdd="500Gb";
		c1.display_size=22.5;
		c1.price=85000.00;
		c1.proce="intel i7";
		c1.ram=16;
		c1.sno=123456;
		c1.product_info();
		Laptop c2=new Laptop();
		c2.model="Dell2478";
		c2.hdd="2TB";
		c2.display_size=17.5;
		c2.price=68000.00;
		c2.proce="intel i5";
		c2.ram=16;
		c2.sno=987654;
		c2.product_info();
	}
}
