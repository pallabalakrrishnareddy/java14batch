package nesteddemo;
class Test
{	
	void m1()
	{
		System.out.println("outer class Method 1");
		 class Demo
			{
				void m3()
				{
					System.out.println("inner class Method");
				}
			}
		 Demo d1=new Demo();
		d1.m3();
	}
				
	void m2()
	{
		System.out.println("outer class method2");
		//d1.m3();
	}
}
public class NestedDemo {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.m1();
		t1.m2();
//		t1.m3();
		//Demo d1=new Demo();
		//Test.Demo d1=new Test.Demo();
	}

}
