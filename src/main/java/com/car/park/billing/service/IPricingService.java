package com.car.park.billing.service;

import java.util.List;

import com.car.park.model.PriceRange;

public interface IPricingService {

	List<PriceRange> getPriceRangesBySpentTime(int spentTimeInMin);
}
