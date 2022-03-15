package oops;

public class Bike {
private String model;
private int mil;
private int cc;
private String col;
private double price;
public Bike() {
	super();
	// TODO Auto-generated constructor stub
}
public Bike(String model, int mil, int cc, String col, double price) {
	super();
	this.model = model;
	this.mil = mil;
	this.cc = cc;
	this.col = col;
	this.price = price;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getMil() {
	return mil;
}
public void setMil(int mil) {
	this.mil = mil;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}
public String getCol() {
	return col;
}
public void setCol(String col) {
	this.col = col;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Bike [model=" + model + ", mil=" + mil + ", cc=" + cc + ", col=" + col + ", price=" + price + "]";
}

}
