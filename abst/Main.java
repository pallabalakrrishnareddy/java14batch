package abst;

public class Main {

	public static void main(String[] args) {
	//Bike b1=new Bike();
		Bike b1=new Cbr("CBR2021","red",250,40,78675.90);
		b1.BikeInfo();
		b1.gare();
		b1.breaking();
		Bike b2=new Hero("hero2021","blue",222,43,86675.90);
		b2.BikeInfo();
		b2.gare();
		b2.breaking();
	}

}
