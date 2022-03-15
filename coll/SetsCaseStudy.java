package coll;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Course
{
	private String cname;
	private int dur;
	private int fee;
	private String loc;
	private String sdate;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String cname, int dur, int fee, String loc, String sdate) {
		super();
		this.cname = cname;
		this.dur = dur;
		this.fee = fee;
		this.loc = loc;
		this.sdate = sdate;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getDur() {
		return dur;
	}
	public void setDur(int dur) {
		this.dur = dur;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	
}
public class SetsCaseStudy {

	public static void main(String[] args) {
		HashSet<Course> hs=new HashSet<>();
		hs.add(new Course("java", 30,45000,"Hyd","05-oct-2021"));
		hs.add(new Course("AWS", 40,15000,"Hyd","05-oct-2021"));
		hs.add(new Course("pega",20,30000,"Hyd","05-oct-2021"));
		hs.add(new Course("SAP", 50,23000,"Hyd","05-oct-2021"));
		hs.add(new Course("ms.net",80,12000,"Hyd","05-oct-2021"));
		hs.add(new Course("sas ",10,78000,"Hyd","05-oct-2021"));
		System.out.println("cname           dur          fee              loc           sdate");
		for(Course v:hs)
		{
			System.out.println(v.getCname()+"\t\t"+v.getDur()+"\t\t"+v.getFee()+"\t\t"+v.getLoc()+"\t\t"+v.getSdate());
		}
		System.out.println("linked Hashset output");
		LinkedHashSet<Course> lhs=new LinkedHashSet<>();
		lhs.add(new Course("java", 30,45000,"Hyd","05-oct-2021"));
		lhs.add(new Course("AWS", 40,15000,"Hyd","05-oct-2021"));
		lhs.add(new Course("pega",20,30000,"Hyd","05-oct-2021"));
		lhs.add(new Course("SAP", 50,23000,"Hyd","05-oct-2021"));
		lhs.add(new Course("ms.net",80,12000,"Hyd","05-oct-2021"));
		lhs.add(new Course("sas ",10,78000,"Hyd","05-oct-2021"));
		System.out.println("cname           dur          fee              loc           sdate");
		for(Course v:lhs)
		{
			System.out.println(v.getCname()+"\t\t"+v.getDur()+"\t\t"+v.getFee()+"\t\t"+v.getLoc()+"\t\t"+v.getSdate());
		}
}

}
