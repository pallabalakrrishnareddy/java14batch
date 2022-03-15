package excep;

public class ContactDetailBO {
	public static void validate(String mobileNumber,String alternateMobileNumber) throws DuplicateMobileNumberException
	{
		if(mobileNumber.equals(alternateMobileNumber))
		{
			throw new DuplicateMobileNumberException() ;
		}
	}
}
