package threadsdemo;
class Student
{
	public   void stuResult(int htno,String name,String result)
	{
		System.out.print(htno+"\t"+name+"\t");
				try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
	}
}
class MyThread1 extends Thread
{	Student s;
	MyThread1(Student s)
	{
		this.s=s;
	}
	public void run()
	{	synchronized(s)
		{
		s.stuResult(1234,"sai","pass");
		}
	}
}
class MyThread2 extends Thread
{	Student s;
	MyThread2(Student s)
	{
		this.s=s;
	}
	public void run()
	{	synchronized(s) {
		s.stuResult(6543,"raju","fail");
	}
}
}
class MyThread3 extends Thread
{	Student s;
	MyThread3(Student s)
	{
		this.s=s;
	}
	public void run()
	{		synchronized(s)
		{
		s.stuResult(9876,"vijay","under hold");
	}
	}
}
class MyThread4 extends Thread
{	Student s;
	MyThread4(Student s)
	{
		this.s=s;
	}
	public void run()
	{
		synchronized(s) {
			
		
		s.stuResult(7690,"pavan","absent");
		}
	}
}
public class SyncDemo {

	public static void main(String[] args) {
		Student s=new Student();
		MyThread1 t1=new MyThread1(s);
		MyThread2 t2=new MyThread2(s);
		MyThread3 t3=new MyThread3(s);
		MyThread4 t4=new MyThread4(s);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
