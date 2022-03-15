package nesteddemo;

public class StringDemo {

	public static void main(String[] args) {
	// as constant
		String s1="hcl technologies";
		// as Object
		String s2=new String("Hyd");
		// char array
		char sub[]= {'j','a','v','a'};
		String s3=new String(sub);
		// as null 
		String s4=null;
System.out.println(s1.charAt(8));
System.out.println(s1.codePointAt(8));
System.out.println(s1.codePointAt(0));
System.out.println(s1.toUpperCase());
String s5="java classes";
System.out.println(s1+s5);
System.out.println(s1.concat(s2));
System.out.println(s1.contains("Tcl"));
System.out.println(s1.endsWith("gies"));
	}

}
