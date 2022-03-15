package oops;
class Father
{
	void parentinfo()
	{
		System.out.println("owen car");
	}
}
class Sai extends Father
{
      void m2()
      {
    	  System.out.println("own bike");
      }
}
public class inhetranceDemo {

	public static void main(String[] args) {
		Sai s=new Sai();
		s.m2();
		s.parentinfo();
	}

}
