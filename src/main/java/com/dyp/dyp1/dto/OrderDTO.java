package com.dyp.dyp1.dto;

public class OrderDTO {
	private Long productid;
	private Long customerid;
	private int quantity;
	
	// utility functions
	public void setCustomerId(Long custId) {
		this.customerid = custId;
	}
	
	public Long getCustomerId() {
		return customerid;
	}
	
	public void setProductId(Long proId) {
		this.productid = proId;
	}
	
	public Long getProductId() {
		return productid;
	}
	public Integer getQuatity() {
		return quantity;
	}
	public void setQuantity(Integer quant) {
		this.quantity = quant;
	}
}
