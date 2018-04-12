package com.egis.test.entity;

public class Local {
	
	String title;
	String address;
	String roadAddress;
	String mapx;
	String mapy;
	int seq;
	
	
	
	
	
	
	public String getRoadAddress() {
		return roadAddress;
	}
	public void setRoadAddress(String roadAddress) {
		this.roadAddress = roadAddress;
	}
	
	public Local(String title, String address, String roadAddress, String mapx, String mapy, int seq) {
		this.title = title;
		this.address = address;
		this.roadAddress = roadAddress;
		this.mapx = mapx;
		this.mapy = mapy;
		this.seq = seq;
	}
	public Local() {
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getMapx() {
		return mapx;
	}
	public void setMapx(String mapx) {
		this.mapx = mapx;
	}
	public String getMapy() {
		return mapy;
	}
	public void setMapy(String mapy) {
		this.mapy = mapy;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	

	
	
	

}
