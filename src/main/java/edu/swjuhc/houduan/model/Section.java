package edu.swjuhc.houduan.model;

public class Section {
	private int BID;
	private int Chapter;
	private String Content;
	private int isshow;
	private int C_id;

	public int getC_id() {
		return C_id;
	}
	public void setC_id(int c_id) {
		C_id = c_id;
	}
	public int getBID() {
		return BID;
	}
	public void setBID(int bID) {
		BID = bID;
	}
	public int getChapter() {
		return Chapter;
	}
	public void setChapter(int chapter) {
		Chapter = chapter;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public int getIsshow() {
		return isshow;
	}
	public void setIsshow(int isshow) {
		this.isshow = isshow;
	}
	@Override
	public String toString() {
		return "Section [BID=" + BID + ", Chapter=" + Chapter + ", Content=" + Content + ", isshow=" + isshow
				+ ", C_id=" + C_id + "]";
	}
}
