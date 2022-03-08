package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "deliveryInfo")
public class DeliveryInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int orderId;
	@Column(length = 30)
	private String productName;
	@Column(length = 30)
	private String userName;
	private LocalDate excectedDeliveryDate;
	@Enumerated(EnumType.STRING)
	private Status status;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "User_Add_id",nullable = false)
	private Address userAddress;
	
	
	public DeliveryInfo() {
		// TODO Auto-generated constructor stub
	}


	
   

	





	public DeliveryInfo(int id, int orderId, String productName, String userName, LocalDate excectedDeliveryDate,
			Status status, Address userAddress) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.productName = productName;
		this.userName = userName;
		this.excectedDeliveryDate = excectedDeliveryDate.plusDays(7);
		this.status = status;
		this.userAddress = userAddress;
	}

	
	







   


	public DeliveryInfo(int orderId, String productName, String userName, LocalDate excectedDeliveryDate, Status status,
			Address userAddress) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.userName = userName;
		this.excectedDeliveryDate = excectedDeliveryDate;
		this.status = status;
		this.userAddress = userAddress;
	}











	public int getId() {
		return id;
	}











	public void setId(int id) {
		this.id = id;
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


	@Override
	public String toString() {
		return String.format(
				"DeliveryInfo [orderId=%s, productName=%s, userName=%s, excectedDeliveryDate=%s, status=%s, userAddress=%s]",
				orderId, productName, userName, excectedDeliveryDate, status, userAddress);
	}
	
	

}
