package com.devsuperior.hrpayrool.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devsuperior.hrpayrool.entities.Payment;
import com.devsuperior.hrpayrool.entities.Worker;
import com.devsuperior.hrpayrool.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient feignClient;
	
	public Payment getPayment(long workerId, int days) {

		Worker worker = feignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(),days);
	}
}
