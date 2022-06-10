package com.sts.userservice.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
   private int id;
   private String name;
   private String email;
   public User(int id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
private List<Contacts> Contacts=new ArrayList<>();
public User(int id, String name, String email, List<com.sts.userservice.entity.Contacts> contacts) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	Contacts = contacts;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + ", Contacts=" + Contacts + "]";
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public List<Contacts> getContacts() {
	return Contacts;
}
public void setContacts(java.awt.List contact) {
	Contacts = (List<com.sts.userservice.entity.Contacts>) contact;
}
}
