package edu.swjuhc.houduan.model;

public class SysUser {
	private int UId;
	private String username;
	private String password;
	private String name;
	private int age;
	private String sex;
	private String introduction;
	public int getUId() {
		return UId;
	}
	public void setUId(int uId) {
		UId = uId;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "SysUser [UId=" + UId + ", username=" + username + ", password=" + password + ", name=" + name + ", age="
				+ age + ", sex=" + sex + ", introduction=" + introduction + "]";
	}
}
