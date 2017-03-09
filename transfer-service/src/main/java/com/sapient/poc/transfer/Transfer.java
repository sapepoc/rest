package com.sapient.poc.transfer;

import java.util.logging.Logger;

import org.apache.camel.ConsumerTemplate;
import org.springframework.stereotype.Component;

import com.sapient.poc.reader.Employee;

@Component
public class Transfer {
	
	private final static Logger LOGGER = Logger.getLogger(Transfer.class.getName());
	
	private ConsumerTemplate consumer;
	
	public Transfer(ConsumerTemplate consumer) {
		this.consumer = consumer;
	}
	
	public Employee getEmployees() {
		Employee employee = consumer.receiveBody("activemq:queue:transferQueue", Employee.class);
		LOGGER.info("Received messages from transferQueue:"+employee);
		return employee;
	}
	
	
}
