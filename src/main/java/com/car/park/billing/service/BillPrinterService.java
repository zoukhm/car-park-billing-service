package com.car.park.billing.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.car.park.billing.utils.DateUtils;
import com.car.park.model.Bill;

public class BillPrinterService implements IBillPrinterService {
	
	private static final Logger logger = LogManager.getLogger(BillPrinterService.class);

	@Override
	public void printBill(Bill bill) {
		StringBuilder billAsString = new StringBuilder();
		billAsString.append("\n");
		billAsString.append("- véhicule : "+bill.getVehicleType());
		billAsString.append("\n");
		billAsString.append("- temps passé : "+DateUtils.formatMinutes(bill.getSpentTimeInMin()));
		billAsString.append("\n");
		billAsString.append("- montant dû : "+bill.getAmountToPay()+" euros");
		logger.info(billAsString);
		
	}

	

}
