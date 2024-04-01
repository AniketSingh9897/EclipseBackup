package com.api.pojo;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import static com.utility.Utility.*;

public class Runner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can use this when we are using class name of utility for static method
		// calling.
		// CreateJobPOJO createJobPOJO=Utility.getcreateJobPOJO();
		// String data=Utility.convertPOJOToJson(createJobPOJO);
		// System.out.println(data);

		// we can call without class name if we make import utility(line no5)as static
		// and.* , w can call using method name
		CreateJobPOJO createJobPOJO = getcreateJobPOJO();
		String data = convertPOJOToJson(createJobPOJO);
		System.out.println(data);
	}

}
