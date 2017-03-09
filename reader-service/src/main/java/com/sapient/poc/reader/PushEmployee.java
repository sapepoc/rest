package com.sapient.poc.reader;

import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Component;

@Component
public class PushEmployee {
	
	private int counter;
	
	private ProducerTemplate producerTemplate;
	
	public PushEmployee(ProducerTemplate producerTemplate) {
		this.producerTemplate = producerTemplate;
	}
	
	public Employee print() {
		Employee employee = new Employee(++counter, "A"+counter, "Manager", 2000L);
		producerTemplate.sendBody("activemq:queue:transformQueue", employee); //for testing
		return employee;
	}
}
