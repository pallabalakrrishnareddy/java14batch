package nesteddemo;
abstract class Bike
{
	abstract void gare();
}
abstract class Testing
{
	abstract void m1();
}
public class AnonymousInnerClassDemo1 {

	public static void main(String[] args) {
		Bike b1=new Bike()
							//AnonymousInnerClassDemo1$1 extends nesteddemo.Bike
				
				{
			void gare()
			{
				System.out.println("gare info");
			}
				}
				;
b1.gare();
Testing t1=new Testing()
								//AnonymousInnerClassDemo1$2 extends nesteddemo.Testing
{
	void m1()
	{
		System.out.println("m1 info");
	}
};
	}

}
