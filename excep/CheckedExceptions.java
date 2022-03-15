package excep;

public class CheckedExceptions {

	public static void main(String[] args) throws Exception {
		while(true)
		{
		System.out.println("red--> stop");
			Thread.sleep(5000);
		System.out.println("<---go");
			Thread.sleep(3000);
		System.out.println("go-->");
			Thread.sleep(100000);
	}
	}
}
