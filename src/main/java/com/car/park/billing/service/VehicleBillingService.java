package com.car.park.billing.service;

import java.util.List;
import java.util.stream.Collectors;

import com.car.park.model.PriceRange;

public class VehicleBillingService implements IBillingService {
	
	private IPricingService pricingService;
	
	


	public VehicleBillingService(IPricingService pricingService) {
		this.pricingService = pricingService;
	}



	@Override
	public double calculateTheAmountToPay(int spentTimeInMin) {
		List<PriceRange> priceRanges = pricingService.getPriceRangesBySpentTime(spentTimeInMin);

		return priceRanges.stream().map(priceRg-> priceRg.getPricePerUnit()*priceRg.getUnitNumber()).collect(Collectors.summingDouble(price->price));
	}

}
