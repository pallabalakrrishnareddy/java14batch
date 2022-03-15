package threadsdemo;

public class OurThread extends Test implements Runnable {

	@Override
	public void run() {
	System.out.println("Thread is created");

	}
public static void main(String args[])
{
	OurThread ot=new OurThread();
	Thread t=new Thread(ot);
	t.start();
}
}
