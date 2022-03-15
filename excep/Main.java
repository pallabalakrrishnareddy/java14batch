package excep;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the contact details");
String s=sc.nextLine();
String arr[]=s.split(",");
ContactDetail c=new ContactDetail(arr[0],arr[1],arr[2],arr[3],arr[4]);
ContactDetailBO bo=new ContactDetailBO();
try {
	bo.validate(c.getMobileNumber(),c.getAlternateMobileNumber());
	System.out.println(c);
} catch (DuplicateMobileNumberException e) {
	// TODO Auto-generated catch block
System.out.println(e);
}
	}

}
