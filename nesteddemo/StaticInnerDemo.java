package nesteddemo;

public class StaticInnerDemo {

	public static void main(String[] args) {
		Hcl h1=new Hcl();
		h1.empInfo();
		
		//h1.update();
		//Att a1=new Att();
		Hcl.Att a1=new Hcl.Att();
		a1.update();
	}

}
