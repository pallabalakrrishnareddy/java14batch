package nesteddemo;
interface Atm
{
	void withdraw();
}
public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
Atm a1=new Atm()

{
	public void withdraw() {
		System.out.println("withdraw done from SBI");
	}
}
;
a1.withdraw();
	}
}
