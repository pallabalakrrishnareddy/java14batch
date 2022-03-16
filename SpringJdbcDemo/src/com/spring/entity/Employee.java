package com.spring.entity;
public class Employee {
private int sapid;
private String name;
private double salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int sapid, String name, double salary) {
	super();
	this.sapid = sapid;
	this.name = name;
	this.salary = salary;
}
public int getSapid() {
	return sapid;
}
public void setSapid(int sapid) {
	this.sapid = sapid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [sapid=" + sapid + ", name=" + name + ", salary=" + salary + "]";
}


}
