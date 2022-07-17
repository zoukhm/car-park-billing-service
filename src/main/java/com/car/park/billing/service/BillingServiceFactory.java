package com.car.park.billing.service;

import com.car.park.enums.VehicleEnum;

public class BillingServiceFactory {
	public static IBillingService createBillingService(VehicleEnum vehicleType) {
		if(vehicleType == null) {
			return null;
		}
		switch(vehicleType) {
			case CAR:
				return new CarBillingService(new PricingService());
			case GPL_CAR:
				return new GPLVehicBillingService(new PricingService());
			case TWO_WHEELED_VEHICLE:
				return new TwoWheeledVehicBillingService(new PricingService());
			default:
				throw new IllegalArgumentException("Unknown Vehicle Type "+vehicleType);
		}
	}
}
