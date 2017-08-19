package data.holder;

import java.util.ArrayList;

import data.model.payment.Payment;

public class PaymentHolder {
	
	private static ArrayList<Payment> payment = new ArrayList<Payment>();

	public static ArrayList<Payment> getPayment() {
		return payment;
	}

	public static void setPayment(ArrayList<Payment> payment) {
		PaymentHolder.payment = payment;
	}
	
	

}
