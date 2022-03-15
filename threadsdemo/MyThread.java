package threadsdemo;

public class MyThread extends Thread {
public void run()
{
System.out.println(Thread.currentThread());
System.out.println(Thread.currentThread().getId());
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
System.out.println(Thread.currentThread().getState());

}
public static void main(String args[])
{
	MyThread mt=new MyThread();
	Thread t1=new Thread(mt);
	Thread t2=new Thread(mt);
	System.out.println(t1.getState());
	t1.setName("java");
	t1.setPriority(2);
	t1.setDaemon(true);
	t1.start();
	t2.start();
	//t.run();
}
}
