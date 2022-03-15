package nesteddemo;

public class StrEqualDemo1 {

	public static void main(String[] args) {
		String s1="admin";
		String s2=new String("admin");
		if(s1==s2)
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
		}
		
		}

	}