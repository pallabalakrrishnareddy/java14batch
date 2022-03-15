package abst;

public class Hero extends Bike {

	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(String model, String col, int cc, int mil, double price) {
		super(model, col, cc, mil, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void gare() {
		System.out.println("hero having 5 gares");
		System.out.println("all are back");

	}

	@Override
	void breaking() {
	System.out.println("hero bike haveing Disk break");

	}

}
