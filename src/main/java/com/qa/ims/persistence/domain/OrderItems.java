package com.qa.ims.persistence.domain;

public class OrderItems {
	
	private Long orderItemsId;
	private Long fkItemsId;
	private Long fkOrderId;
	
	
	
	
	
	public Long getOrderItemsId() {
		return orderItemsId;
	}
	public void setOrderItemsId(Long orderItemsId) {
		this.orderItemsId = orderItemsId;
	}
	public Long getFkItemsId() {
		return fkItemsId;
	}
	public void setFkItemsId(Long fkItemsId) {
		this.fkItemsId = fkItemsId;
	}
	public Long getFkOrderId() {
		return fkOrderId;
	}
	public void setFkOrderId(Long fkOrderId) {
		this.fkOrderId = fkOrderId;
	}
	
	

}
