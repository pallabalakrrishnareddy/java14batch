package inhercase;

public class BankEmp extends Cust {
private int empid;
private double sal;
public BankEmp() {
	super();
	// TODO Auto-generated constructor stub
}
public BankEmp(String name, String dob, String gender, String mobilenumber,int empid, double sal) {
	super(name,dob,gender,mobilenumber);
	this.empid = empid;
	this.sal = sal;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public void empDeatilsInfo()
{
	System.out.println(empid);
	System.out.println(sal);
	super.display();
}
}
