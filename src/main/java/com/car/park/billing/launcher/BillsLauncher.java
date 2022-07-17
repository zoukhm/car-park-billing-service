package com.car.park.billing.launcher;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.car.park.billing.service.BillCreator;
import com.car.park.billing.service.BillPrinterService;
import com.car.park.billing.service.IBillPrinterService;
import com.car.park.model.Bill;

public class BillsLauncher {

	public static void main(String[] args) throws ParseException {
		IBillPrinterService printer =  new BillPrinterService();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		
		//First case
		
		Date startDate = sdf.parse("2022-07-17 13:24");
		Date endDate = sdf.parse("2022-07-17 15:10");
		
		Bill bill = BillCreator.createBill("voiture essence", startDate, endDate);
		
		printer.printBill(bill);
		
		//2nd case
		
		startDate = sdf.parse("2022-07-17 19:30");
		endDate = sdf.parse("2022-07-18 00:37");
		
		bill = BillCreator.createBill("moto essence", startDate, endDate);
		
		printer.printBill(bill);
		
		//3d case
		
		startDate = sdf.parse("2022-07-17 07:43");
		endDate = sdf.parse("2022-07-17 15:10");
		
		bill = BillCreator.createBill("voiture GPL", startDate, endDate);
		
		printer.printBill(bill);
	}
	
	
	
}
