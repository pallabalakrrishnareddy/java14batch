package inhercase;
interface Sbi
{
	double fd=450000.00;
	
}
interface Icici
{
	double fd=750000.00;
	
}
interface Hdfc
{
	double fd=850000.00;
	
}
class Rbi implements Sbi,Icici,Hdfc
{
	public void tot_Fd_Info()
	{
		double totfd=Sbi.fd+Icici.fd+Hdfc.fd;
		System.out.println("total fixdep amount:"+totfd);
	}
}
public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		Rbi r1=new Rbi();
		r1.tot_Fd_Info();

	}

}
