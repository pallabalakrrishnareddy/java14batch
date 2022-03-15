package excep;

public class DuplicateMobileNumberException extends Exception {
String msg;

public DuplicateMobileNumberException() {
	msg="Mobile number and alternate mobile number are same";
}

@Override
public String toString() {
	return "DuplicateMobileNumberException [msg=" + msg + "]";
}

	
}
