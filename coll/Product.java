package coll;
public class Product {
private int id;
private String pname;
private int price;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int id, String pname, int price) {
	super();
	this.id = id;
	this.pname = pname;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
