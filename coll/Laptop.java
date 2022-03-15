package coll;

public class Laptop {
private int ram;
private String model;
private double price;
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
public Laptop(int ram, String model, double price) {
	super();
	this.ram = ram;
	this.model = model;
	this.price = price;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptop [ram=" + ram + ", model=" + model + ", price=" + price + "]\n";
}
}
