package com.api.pojo;

import java.util.Arrays;

public class CreateJobPOJO {

	private int mst_service_location_id;
	private int mst_platform_id;
	private int mst_warrenty_status_id;
	private int mst_oem_id;
	private CustomerPOJO customer;
	private CustomerAddressPOJO customeraddress;
	private CustomerProductPOJO customer_product;
	private ProblemPOJO problems[];
	
	public CreateJobPOJO(int mst_service_location_id, int mst_platform_id, int mst_warrenty_status_id, int mst_oem_id,
			CustomerPOJO customer, CustomerAddressPOJO customeraddress, CustomerProductPOJO customer_product,
			ProblemPOJO[] problems) {
		super();
		this.mst_service_location_id = mst_service_location_id;
		this.mst_platform_id = mst_platform_id;
		this.mst_warrenty_status_id = mst_warrenty_status_id;
		this.mst_oem_id = mst_oem_id;
		this.customer = customer;
		this.customeraddress = customeraddress;
		this.customer_product = customer_product;
		this.problems = problems;
	}

	@Override
	public String toString() {
		return "CreateJobPOJO [mst_service_location_id=" + mst_service_location_id + ", mst_platform_id="
				+ mst_platform_id + ", mst_warrenty_status_id=" + mst_warrenty_status_id + ", mst_oem_id=" + mst_oem_id
				+ ", customer=" + customer + ", customeraddress=" + customeraddress + ", customer_product="
				+ customer_product + ", problems=" + Arrays.toString(problems) + "]";
	}


	
	
	
	
}
