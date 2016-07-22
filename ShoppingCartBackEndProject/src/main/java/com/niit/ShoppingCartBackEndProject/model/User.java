package com.niit.ShoppingCartBackEndProject.model;


import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;


import org.springframework.stereotype.Component;

@Entity
@Table(name="User")
@Component

public class User {
	@Id
	private String Id;

	private String Name;
    private String Password;
    private String Mobile;
    private String Mail;
    private String Address;	
    public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}