package com.car.park.billing.service;

import java.util.ArrayList;
import java.util.List;

import com.car.park.model.PriceRange;
import com.car.park.model.PricingPlan;

public class PricingService implements IPricingService {

	private static final int ONE_HOUR_TO_MIN = 60;
	
	private static final int HALF_HOUR_TO_MIN = 30;
	
	private static final double FREE_PRICE = 0;
	
	private static final double FULL_PRICE = 2;
	
	private static final int MIN_HOURS_TO_HAVE_DISCOUNT = 4;
	
	private static final double DISCOUNTED_PRICE=1.5;
	
	private static List<PricingPlan> pricingPlans = new ArrayList<>();
	
	static {
		pricingPlans.add(new PricingPlan(0, ONE_HOUR_TO_MIN, ONE_HOUR_TO_MIN, FREE_PRICE));
		pricingPlans.add(new PricingPlan(ONE_HOUR_TO_MIN, ONE_HOUR_TO_MIN*MIN_HOURS_TO_HAVE_DISCOUNT, ONE_HOUR_TO_MIN, FULL_PRICE));
		pricingPlans.add(new PricingPlan(ONE_HOUR_TO_MIN*MIN_HOURS_TO_HAVE_DISCOUNT, null, HALF_HOUR_TO_MIN, DISCOUNTED_PRICE));

	}
	
	@Override
	public List<PriceRange> getPriceRangesBySpentTime(int spentTimeInMin) {
		List<PriceRange> priceRanges =  new ArrayList<>();
		
		pricingPlans.forEach(plan->{
			int unitNumber = 0;
			while(spentTimeInMin-plan.getMinMinutes()-unitNumber*plan.getPricingUnitInMinutes()>0 
					&& (plan.getMaxMinutes() == null || unitNumber*plan.getPricingUnitInMinutes()<plan.getMaxMinutes()-plan.getMinMinutes())) {
				unitNumber++;
			}
			priceRanges.add(new PriceRange(unitNumber, plan.getPricePerUnit()));
		});

		
		return priceRanges;
	}

}
