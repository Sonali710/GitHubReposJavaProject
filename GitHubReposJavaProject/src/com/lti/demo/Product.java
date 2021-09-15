package com.lti.demo;

public class Product {
	
	int prdId;
	String prdName="";
	int cost;
	public Product(int prdId, String prdName, int cost) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.cost = cost;
	}
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", cost=" + cost + "]";
	}
	
	

}
