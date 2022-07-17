package com.car.park.billing.service;


import com.car.park.billing.utils.AmountUtils;

public class GPLVehicBillingService extends VehicleBillingService {
	
	public GPLVehicBillingService(IPricingService pricingService) {
		super(pricingService);
	}

	@Override
	public double calculateTheAmountToPay(int spentTimeInMin) {
		return AmountUtils.roundUp(super.calculateTheAmountToPay(spentTimeInMin)*(1.07));
	}

}
