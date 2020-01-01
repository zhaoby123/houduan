package edu.swjuhc.houduan.model;

public class Administrator {
	private String j_password;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private String username;
	private String password;
	private String name;
	private String sex;
	private int number;
	private int age;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "Administrator [j_password=" + j_password + ", id=" + id + ", username=" + username + ", password="
				+ password + ", name=" + name + ", sex=" + sex + ", number=" + number + ", age=" + age + "]";
	}
	
}
