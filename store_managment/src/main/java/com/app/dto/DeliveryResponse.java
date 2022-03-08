package com.app.dto;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.pojos.Address;
import com.app.pojos.Order;
import com.app.pojos.Product;
import com.app.pojos.Status;
import com.app.pojos.Users;
import com.app.service.IAddressService;

public class DeliveryResponse {
	
	@Autowired
	private static IAddressService addressService;
	
	
	private int orderId;
	private String productName;
	private String userName;
	private LocalDate excectedDeliveryDate;
	private Status status;
	private Address userAddress;
	
	
	public DeliveryResponse() {
		// TODO Auto-generated constructor stub
	}


	public DeliveryResponse(int orderId, String productName, String userName, LocalDate excectedDeliveryDate,
			Status status, Address userAddress) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.userName = userName;
		this.excectedDeliveryDate = excectedDeliveryDate;
		this.status = status;
		this.userAddress = userAddress;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public LocalDate getExcectedDeliveryDate() {
		return excectedDeliveryDate;
	}


	public void setExcectedDeliveryDate(LocalDate excectedDeliveryDate) {
		this.excectedDeliveryDate = excectedDeliveryDate;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public Address getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}
	
	public static DeliveryResponse getDeliverInfoByOrder(Order o) {
		Address a= addressService.getDeliveryAddress(o.getCustomer().getId());
		Product p= o.getProduct();
		return new DeliveryResponse(o.getOrderId(), p.getProductName(), o.getCustomer().getFirstName()+" "+o.getCustomer().getLastName(), o.getOdate().plusDays(7), o.getStatus(), a);
	}
	
	

}
