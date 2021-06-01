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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((customer.getId() == null) ? 0 : customer.getId().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		if (getCustomerId() == null) {
			if (other.getCustomerId() != null)
				return false;
		} else if (!getCustomerId().equals(other.getCustomerId()))
			return false;
		return true;
		
	}

}
