package com.app.dto;

import com.app.pojos.Status;
import com.app.pojos.Users;

public class DeliveryRequset {

	private int orderId;
	private Status orderStatus;
	
	public DeliveryRequset() {
		// TODO Auto-generated constructor stub
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Status getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
}
