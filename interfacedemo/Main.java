package interfacedemo;

public class Main {

	public static void main(String[] args) {
		//Atm a1=new Atm();
		Atm a1=new Hdfc();
		a1.withdraw();
		Atm a2=new Sbi();
		a2.withdraw();
		Atm a3=new Pnb();
		a3.withdraw();
	}

}
