package interfacedemo;

public class Hdfc implements Atm {

	@Override
	public void withdraw() {
		System.out.println("withdraw done from HDFC Bank");
	}

}
