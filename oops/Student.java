package oops;

public class Student {
private int sid;
private String name;
Address add;
public Student(int sid, String name, Address add) {
	this.sid = sid;
	this.name = name;
	this.add = add;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
public void display()
{
	System.out.println(sid+" , "+name);
	System.out.println(add.getHno());
	System.out.println(add.getCityname());
	System.out.println(add.getState());
	System.out.println(add.getPinno());
}
}
