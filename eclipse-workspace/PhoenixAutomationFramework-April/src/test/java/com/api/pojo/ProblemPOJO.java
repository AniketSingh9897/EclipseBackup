package com.api.pojo;

public class ProblemPOJO {
private int id;
private String remark;
@Override
public String toString() {
	return "ProblemPojo [id=" + id + ", remark=" + remark + "]";
	
}
public ProblemPOJO(int id, String remark) {
	super();
	this.id = id;
	this.remark = remark;
}


}
