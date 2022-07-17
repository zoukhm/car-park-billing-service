package com.car.park.model;


public class Bill {

	private String vehicleType;
	
	private double amountToPay;
	
	private int spentTimeInMin;

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getAmountToPay() {
		return amountToPay;
	}

	public void setAmountToPay(double amountToPay) {
		this.amountToPay = amountToPay;
	}

	public int getSpentTimeInMin() {
		return spentTimeInMin;
	}

	public void setSpentTimeInMin(int spentTimeInMin) {
		this.spentTimeInMin = spentTimeInMin;
	}
	
	
	
	
}
