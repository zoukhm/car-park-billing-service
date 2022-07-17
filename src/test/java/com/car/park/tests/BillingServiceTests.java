package com.car.park.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.car.park.billing.service.BillCreator;
import com.car.park.model.Bill;

public class BillingServiceTests {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
	
	
	@Test
	public void should_create_a_bill_with_amount_equals_to_2euros() throws ParseException {
		
		Date startDate = sdf.parse("2022-07-17 13:24");
		Date endDate = sdf.parse("2022-07-17 15:10");
		
		Bill bill = BillCreator.createBill("voiture essence", startDate, endDate);

		assertEquals(2.0, bill.getAmountToPay());
	}
	
	@Test
	public void should_create_a_bill_with_amount_equals_to_5_points_5euros() throws ParseException {
		
		Date startDate = sdf.parse("2022-07-17 19:30");
		Date endDate = sdf.parse("2022-07-18 00:37");
		
		Bill bill = BillCreator.createBill("moto essence", startDate, endDate);

		assertEquals(5.5, bill.getAmountToPay());
	}
	
	
	@Test
	public void should_create_a_bill_with_amount_equals_to_18euros() throws ParseException {
		
		
		Date startDate = sdf.parse("2022-07-17 07:43");
		Date endDate = sdf.parse("2022-07-17 15:10");
		
		Bill bill = BillCreator.createBill("voiture GPL", startDate, endDate);

		assertEquals(18.0, bill.getAmountToPay());
	}
}
