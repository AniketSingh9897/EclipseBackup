package com.utility;

import com.api.pojo.CreateJobPOJO;
import com.api.pojo.CustomerAddressPOJO;
import com.api.pojo.CustomerPOJO;
import com.api.pojo.CustomerProductPOJO;
import com.api.pojo.ProblemPOJO;
import com.github.javafaker.Faker;
import com.google.gson.Gson;

public class Utility {
	public static CreateJobPOJO getcreateJobPOJO() 
	{ 
		Faker faker=new Faker();
		String fname=faker.name().firstName();
		String cnmae=faker.numerify("9897######");
		String imei=faker.numerify("1234#######");
		String email=faker.internet().emailAddress();

		String email1=faker.internet().emailAddress();
		
	CustomerAddressPOJO customerAddressPOJO = new CustomerAddressPOJO("96", "mansoroavr", "colony", "bulandshar",
			"up", "india", "india1", "testok");
	CustomerPOJO customerPojo = new CustomerPOJO(fname, "singh", cnmae, cnmae, email, email1);
	CustomerProductPOJO customerProductPOJO=new CustomerProductPOJO("imei","test2","test3","test4","test5",55,66);
	ProblemPOJO problemPOJO[]=new ProblemPOJO[3];
	problemPOJO[0]=new ProblemPOJO(1,"TEST");
	CreateJobPOJO createJobPOJO = new CreateJobPOJO(1, 2, 3, 4, customerPojo, customerAddressPOJO, customerProductPOJO, problemPOJO);
	return createJobPOJO ;
	
	
}



public static String convertPOJOToJson(Object data) {
	Gson gson = new Gson();
	String result = gson.toJson(data);
	return result;

}
}
