package inhercase;

public class Cust {
private String name;
private String Dob;
private String gender;
private String mobilenumber;
public Cust() {
	System.out.println("Cust Login doned");
}
public Cust(String name, String dob, String gender, String mobilenumber) {
	this();
	this.name = name;
	Dob = dob;
	this.gender = gender;
	this.mobilenumber = mobilenumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return Dob;
}
public void setDob(String dob) {
	Dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}

public void display()
{
	System.out.println(name);
	System.out.println(Dob);
	System.out.println(gender);
	System.out.println(mobilenumber);
}
}
