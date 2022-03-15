package oops;
public class Emp {
private String name;
private int sapid;
private char gen;
private double sal;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSapid() {
	return sapid;
}
public void setSapid(int sapid) {
	this.sapid = sapid;
}
public char getGen() {
	return gen;
}
public void setGen(char gen) {
	this.gen = gen;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public void display()
{
	System.out.println(name);
	System.out.println(sapid);
	System.out.println(gen);
	System.out.println(sal);
}
}
