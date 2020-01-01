package edu.swjuhc.houduan.model;

public class Books {
	private int BID;
	private String authorname;
	private String bookname;
	private String image;
	private String sta;
	private String type;
	private int score;
	private String introduce;
	public int getBID() {
		return BID;
	}
	public void setBID(int bID) {
		BID = bID;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSta() {
		return sta;
	}
	public void setSta(String sta) {
		this.sta = sta;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	@Override
	public String toString() {
		return "Books [BID=" + BID + ", authorname=" + authorname + ", bookname=" + bookname + ", image=" + image
				+ ", sta=" + sta + ", type=" + type + ", score=" + score + ", introduce=" + introduce + "]";
	}
}
