package inher;
public class Sai extends Hcl {
	double fee=500000.00;
void feeInfo()
{
	System.out.println(fee);
	System.out.println(super.fee);
	this.exams();
	super.exams();
}
public void exams()
{
	System.out.println("exams are over");
}
}
