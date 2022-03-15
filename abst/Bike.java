package abst;
public abstract class Bike {
private String model,col;
private int cc,mil;
private double price;
	public Bike() {
		System.out.println("*********Welcome to ASDF Bike ShowRoom********");
	}
	public Bike(String model, String col, int cc, int mil, double price) {
		super();
		this.model = model;
		this.col = col;
		this.cc = cc;
		this.mil = mil;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCol() {
		return col;
	}
	public void setCol(String col) {
		this.col = col;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getMil() {
		return mil;
	}
	public void setMil(int mil) {
		this.mil = mil;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void BikeInfo()
	{
		System.out.println(model);
		System.out.println(cc);
		System.out.println(price);
		System.out.println(mil);
		System.out.println(col);
	}
	abstract void gare();
	abstract void breaking();
}
