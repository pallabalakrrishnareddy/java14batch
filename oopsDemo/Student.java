package oopsDemo;

public class Student {
int sid;
String name;
Course c1;
public Student(int sid, String n, Course c1) {
	super();
	this.sid = sid;
	name = n;
	this.c1 = c1;
}
public void display()
{
	System.out.println(sid);
	System.out.println(name);
	System.out.println(c1.cid);
	System.out.println(c1.name);
	System.out.println(c1.dur);
	System.out.println(c1.fee);
}
}
