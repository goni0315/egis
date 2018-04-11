package com.egis.test.entity;

public class Board {
	
	int seq;
	String title;
	String content;
	String date;
	
	
	
	
	public Board() {
	}
	public Board(int seq, String title, String content, String date) {
		this.seq = seq;
		this.title = title;
		this.content = content;
		this.date = date;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	

	
}
