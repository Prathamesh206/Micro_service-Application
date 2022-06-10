package com.sts.userservice.entity;

public class Contacts {
   private int cid;
   private String name;
   private Long uid;
public Contacts() {
	super();
	// TODO Auto-generated constructor stub
}
public Contacts(int cid, String name, Long uid) {
	super();
	this.cid = cid;
	this.name = name;
	this.uid = uid;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getUid() {
	return uid;
}
public void setUid(Long uid) {
	this.uid = uid;
}
}
