package abst;

public class Activa extends Bike {

	public Activa() {
		// TODO Auto-generated constructor stub
	}

	public Activa(String model, String col, int cc, int mil, double price) {
		super(model, col, cc, mil, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void gare() {
	System.out.println("activa haveing no gares");

	}

	@Override
	void breaking() {
System.out.println("activa haveing normal breaks");
	}

}
