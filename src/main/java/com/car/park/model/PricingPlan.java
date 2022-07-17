package com.car.park.model;

public class PricingPlan {

	private Integer minMinutes;
	
	private Integer maxMinutes;
	
	private int pricingUnitInMinutes;
	
	private double pricePerUnit;
	

	public PricingPlan(Integer minMinutes, Integer maxMinutes, int pricingUnitInMinutes, double pricePerUnit) {
		super();
		this.minMinutes = minMinutes;
		this.maxMinutes = maxMinutes;
		this.pricingUnitInMinutes = pricingUnitInMinutes;
		this.pricePerUnit = pricePerUnit;
	}

	public Integer getMinMinutes() {
		return minMinutes;
	}

	public void setMinMinutes(Integer minMinutes) {
		this.minMinutes = minMinutes;
	}

	public Integer getMaxMinutes() {
		return maxMinutes;
	}

	public void setMaxMinutes(Integer maxMinutes) {
		this.maxMinutes = maxMinutes;
	}

	public int getPricingUnitInMinutes() {
		return pricingUnitInMinutes;
	}

	public void setPricingUnitInMinutes(int pricingUnitInMinutes) {
		this.pricingUnitInMinutes = pricingUnitInMinutes;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
	
}
