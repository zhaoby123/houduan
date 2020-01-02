package edu.swjuhc.houduan.model;

import java.sql.Time;

public class Administrator {
	private String j_password;
	private int ID;
	private String adName;
	private String password;
	private String Name;
	private String Number;
	public String getJ_password() {
		return j_password;
	}
	public void setJ_password(String j_password) {
		this.j_password = j_password;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	@Override
	public String toString() {
		return "Administrator [j_password=" + j_password + ", ID=" + ID + ", adName=" + adName + ", password="
				+ password + ", Name=" + Name + ", Number=" + Number + "]";
	}

	
}
