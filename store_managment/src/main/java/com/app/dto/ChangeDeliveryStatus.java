package com.app.dto;

import com.app.pojos.Status;

public class ChangeDeliveryStatus {
	
	private int dInt;
	private Status status;
	
	public ChangeDeliveryStatus() {
		// TODO Auto-generated constructor stub
	}

	public ChangeDeliveryStatus(int dInt, Status status) {
		super();
		this.dInt = dInt;
		this.status = status;
	}

	public int getdInt() {
		return dInt;
	}

	public void setdInt(int dInt) {
		this.dInt = dInt;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return String.format("ChangeDeliveryStatus [dInt=%s, status=%s]", dInt, status);
	}
	
	

}
