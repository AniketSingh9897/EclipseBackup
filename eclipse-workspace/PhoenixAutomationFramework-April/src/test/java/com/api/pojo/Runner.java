package com.api.pojo;

import com.google.gson.Gson;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginRequestPOJO loginRequestPOJO1 = new LoginRequestPOJO("iamfd", "password");
		System.out.println(loginRequestPOJO1);
		LoginRequestPOJO loginRequestPOJO2 = new LoginRequestPOJO("iamsuper", "password");
		System.out.println(loginRequestPOJO2);
// to convert java object to json
//java does know how to it
// 3rd party json will do
		Gson gson = new Gson();
		String data = gson.toJson(loginRequestPOJO1);
		System.out.println(data);
		data=gson.toJson(loginRequestPOJO2);
		System.out.println(data);
	}

}
