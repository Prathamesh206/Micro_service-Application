package com.sts.contactService.entity;

public class Contacts {
   private int cid;
   private String name;
   private int uid;
public Contacts() {
	super();
	// TODO Auto-generated constructor stub
}
public Contacts(int cid, String name, int uid) {
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
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
}
