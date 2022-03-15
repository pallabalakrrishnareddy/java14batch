package serdemo;

import java.io.Serializable;

public class Bank implements Serializable {
	private int cid;
	private String password;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int cid, String password) {
		super();
		this.cid = cid;
		this.password = password;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
