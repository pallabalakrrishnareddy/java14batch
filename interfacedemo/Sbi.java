package interfacedemo;
public class Sbi implements Atm {
	@Override
	public void withdraw() {
		System.out.println("withdraw done from Sbi Account");
	}
}
