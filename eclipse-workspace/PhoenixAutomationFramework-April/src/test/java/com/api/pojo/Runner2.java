package com.api.pojo;

import com.google.gson.Gson;

public class Runner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Data data1=new Data("test123");

LoginResponse gsontest=new LoginResponse("message",data1);
Gson gson=new Gson();
String json12=gson.toJson(gsontest);
System.out.println(json12);
	}

}
