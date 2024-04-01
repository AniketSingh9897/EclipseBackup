package com.api.pojo;

public class CustomerAddressPOJO {
 private String flatno;
 private String apartmentname;
 private String streetname;
 private String landmark;
 private String area;
 private String pincode;
 private String country;
 private String state;
@Override
public String toString() {
	return "CustomerAddressPOJO [flatno=" + flatno + ", apartmentname=" + apartmentname + ", streetname=" + streetname
			+ ", landmark=" + landmark + ", area=" + area + ", pincode=" + pincode + ", country=" + country + ", state="
			+ state + "]";
}
public CustomerAddressPOJO(String flatno, String apartmentname, String streetname, String landmark, String area,
		String pincode, String country, String state) {
	super();
	this.flatno = flatno;
	this.apartmentname = apartmentname;
	this.streetname = streetname;
	this.landmark = landmark;
	this.area = area;
	this.pincode = pincode;
	this.country = country;
	this.state = state;
}
 
}
