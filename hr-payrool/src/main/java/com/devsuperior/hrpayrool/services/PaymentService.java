package com.devsuperior.hrpayrool.services;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayrool.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		
		return new Payment("bob", 250.0,days);
	}
}
