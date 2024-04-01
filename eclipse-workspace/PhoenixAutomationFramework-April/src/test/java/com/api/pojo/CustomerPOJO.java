package com.api.pojo;

public class CustomerPOJO {
private String firstname;
private String lastname;
private String contactno;
private String contactnoalt;
private String email;
private String emailalt;



public CustomerPOJO(String firstname, String lastname, String contactno, String contactnoalt, String email,
		String emailalt) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.contactno = contactno;
	this.contactnoalt = contactnoalt;
	this.email = email;
	this.emailalt = emailalt;
}



@Override
public String toString() {
	return "CustomerPojo [firstname=" + firstname + ", lastname=" + lastname + ", contactno=" + contactno
			+ ", contactnoalt=" + contactnoalt + ", email=" + email + ", emailalt=" + emailalt + "]";
}









}
