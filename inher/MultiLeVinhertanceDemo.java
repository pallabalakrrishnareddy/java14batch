package inher;

public class MultiLeVinhertanceDemo {

	public static void main(String[] args) {
		Abc a1=new Abc();
		a1.m1();
		//a1.m2();
		//a1.m3();
		Pqr p1=new Pqr();
		p1.m1();
		p1.m2();
		//p1.m3();
		Xyz a=new Xyz();
		a.m1();
		a.m2();
		a.m3();
	}

}
