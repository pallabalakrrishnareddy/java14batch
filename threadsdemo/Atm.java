package threadsdemo;

public class Atm extends Thread{
	private int cid;
	private String cname,loc;
	public Atm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Atm(int cid, String cname, String loc) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.loc = loc;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
		public void run()
		{
			for(int i=1;i<=20;i++)
			{
				System.out.println(cid+"-->"+cname+"-->"+loc +"-->"+i);
			
			}
		}
}
