package oops;

public class Address {
private  String hno;
private String cityname;
private String state;
private int pinno;
public Address(String hno, String cityname, String state, int pinno) {
	super();
	this.hno = hno;
	this.cityname = cityname;
	this.state = state;
	this.pinno = pinno;
}
public String getHno() {
	return hno;
}
public void setHno(String hno) {
	this.hno = hno;
}
public String getCityname() {
	return cityname;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPinno() {
	return pinno;
}
public void setPinno(int pinno) {
	this.pinno = pinno;
}

}
