package com.qa.ims.persistence.domain;

public class OrderItems {
	
	private Long orderItemsId;
	private Long fkItemsId;
	private Long fkOrderId;
	
	public OrderItems(Long orderItemsId) {
		super();
		this.orderItemsId = orderItemsId;
	}
	public OrderItems(Long orderItemsId, Long fkItemsId, Long fkOrderId) {
		super();
		this.orderItemsId = orderItemsId;
		this.fkItemsId = fkItemsId;
		this.fkOrderId = fkOrderId;
	}
	
	
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
	
	
	@Override
	public String toString() {
		return "OrderItems [orderItemsId=" + orderItemsId + ", fkItemsId=" + fkItemsId + ", fkOrderId=" + fkOrderId
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fkItemsId == null) ? 0 : fkItemsId.hashCode());
		result = prime * result + ((fkOrderId == null) ? 0 : fkOrderId.hashCode());
		result = prime * result + ((orderItemsId == null) ? 0 : orderItemsId.hashCode());
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
		OrderItems other = (OrderItems) obj;
		if (fkItemsId == null) {
			if (other.fkItemsId != null)
				return false;
		} else if (!fkItemsId.equals(other.fkItemsId))
			return false;
		if (fkOrderId == null) {
			if (other.fkOrderId != null)
				return false;
		} else if (!fkOrderId.equals(other.fkOrderId))
			return false;
		if (orderItemsId == null) {
			if (other.orderItemsId != null)
				return false;
		} else if (!orderItemsId.equals(other.orderItemsId))
			return false;
		return true;
	}
	
	

}
