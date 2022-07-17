package com.car.park.model;


public class PriceRange {

	private int unitNumber;
	
	private double pricePerUnit;
	
	

	public PriceRange(int unitNumber, double pricePerUnit) {
		super();
		this.unitNumber = unitNumber;
		this.pricePerUnit = pricePerUnit;
	}

	public int getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}	
	
	
}
