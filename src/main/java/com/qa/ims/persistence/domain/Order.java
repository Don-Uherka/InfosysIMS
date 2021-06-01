package com.qa.ims.persistence.domain;

public class Order {
	
	Customer customer;
	private Long orderId;
	
	public Order(Customer customer, Long id) {
		this.customer = customer;
		this.setId(id);
	}
	
	
	
	public Long getId() {
		return orderId;
	}
	
	public void setId(Long orderId) {
		this.orderId = orderId;
	}
	
	public Long getCustomerId() {
		return customer.getId();
	}
	
	@Override
	public String toString() {
		return "id: " + orderId + "Customer id: " + customer.getId();
	}

}
