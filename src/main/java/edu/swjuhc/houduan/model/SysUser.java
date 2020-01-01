package edu.swjuhc.houduan.model;

import java.sql.JDBCType;
import java.sql.Time;

public class SysUser {
	private String username;
	private String password;
	private String usernumber;
	private String j_usernumber;
	private String j_password;
	private String name;
	private String sex;
	private String introduction;
	private Time Regtime;
	private String Author;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsernumber() {
		return usernumber;
	}
	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}
	public String getJ_usernumber() {
		return j_usernumber;
	}
	public void setJ_usernumber(String j_usernumber) {
		this.j_usernumber = j_usernumber;
	}
	public String getJ_password() {
		return j_password;
	}
	public void setJ_password(String j_password) {
		this.j_password = j_password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Time getRegtime() {
		return Regtime;
	}
	public void setRegtime(Time regtime) {
		Regtime = regtime;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	@Override
	public String toString() {
		return "SysUser [username=" + username + ", password=" + password + ", usernumber=" + usernumber
				+ ", j_usernumber=" + j_usernumber + ", j_password=" + j_password + ", name=" + name + ", sex=" + sex
				+ ", introduction=" + introduction + ", Regtime=" + Regtime + ", Author=" + Author + "]";
	}
	
}