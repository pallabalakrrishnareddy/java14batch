package threadsdemo;

public class MutiThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		
	Atm c1=new Atm(1234,"Hrusikesh Sahoo","Odisha");
	Atm c2=new Atm(4205,"AASHISH SHAKYA","DELHI");
	Atm c3=new Atm(3489,"Balakrishna ","Hyd");
	c2.setPriority(1);
	c1.setPriority(10);
	c1.start();
	//c1.sleep(5000);
	c2.start();
	c3.start();
	
	}

}
