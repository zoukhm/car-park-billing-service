package com.car.park.billing.service;

import com.car.park.billing.utils.AmountUtils;

public class TwoWheeledVehicBillingService extends VehicleBillingService {
	
	
	public TwoWheeledVehicBillingService(IPricingService pricingService) {
		super(pricingService);
	}

	@Override
	public double calculateTheAmountToPay(int spentTimeInMin) {
		return AmountUtils.roundUp(super.calculateTheAmountToPay(spentTimeInMin)*(0.5));
	}
}
