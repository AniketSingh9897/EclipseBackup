package com.api.pojo;

public class CustomerProductPOJO {
	private String dop;
	private String serialno;
	private String imei1;
	private String imei2;
	private String popurl;
	private int product_id;
	private int mst_id;
	public CustomerProductPOJO(String dop, String serialno, String imei1, String imei2, String popurl, int product_id,
			int mst_id) {
		super();
		this.dop = dop;
		this.serialno = serialno;
		this.imei1 = imei1;
		this.imei2 = imei2;
		this.popurl = popurl;
		this.product_id = product_id;
		this.mst_id = mst_id;
	}
	@Override
	public String toString() {
		return "CustomerProductPOJO [dop=" + dop + ", serialno=" + serialno + ", imei1=" + imei1 + ", imei2=" + imei2
				+ ", popurl=" + popurl + ", product_id=" + product_id + ", mst_id=" + mst_id + "]";
	}
	
}
