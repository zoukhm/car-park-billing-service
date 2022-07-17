package com.car.park.billing.service;

import java.util.Date;

import com.car.park.billing.utils.DateUtils;
import com.car.park.enums.VehicleEnum;
import com.car.park.model.Bill;

public class BillCreator {

	private static final String GPL = "GPL";
	private static final String MOTO = "moto";

	public static Bill createBill(String vehicleType, Date startDate, Date endDate) {
		Bill bill = new Bill();
		
		bill.setVehicleType(vehicleType);
		int spentTimeInMin = DateUtils.calculateMinutesBetweenTwoDates(startDate, endDate);
		bill.setSpentTimeInMin(spentTimeInMin);
		VehicleEnum vehicleEnum = VehicleEnum.CAR;
		if(vehicleType.contains(GPL)) {
			vehicleEnum = VehicleEnum.GPL_CAR; 
		} else if(vehicleType.contains(MOTO)){
			vehicleEnum = VehicleEnum.TWO_WHEELED_VEHICLE; 
		}
		double amountToPay = BillingServiceFactory.createBillingService(vehicleEnum).calculateTheAmountToPay(spentTimeInMin);
		bill.setAmountToPay(amountToPay );
		
		return bill;
	}
}
