package oopsDemo;

public class MethodDemo {
int x=45;
static int y=25;
public void m1()
{
	System.out.println(x);
	System.out.println(y);
}
public static void m2()
{
	MethodDemo md1=new MethodDemo();
	System.out.println(md1.x);
	System.out.println(y);
}
public void m3()
{
	this.m1();
	this.m2();
}
	public static void main(String[] args) {
		MethodDemo md2=new MethodDemo();
		md2.m3();
		m2();

	}

}
