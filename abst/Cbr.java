package abst;

public class Cbr extends Bike {

	public Cbr() {
		// TODO Auto-generated constructor stub
	}

	public Cbr(String model, String col, int cc, int mil, double price) {
		super(model, col, cc, mil, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void gare() {
	System.out.println("cbr haveing 6 gares");
	System.out.println("1 down reming up");
	}

	@Override
	void breaking() {
		System.out.println("cbr haveing ABS System");

	}

}
