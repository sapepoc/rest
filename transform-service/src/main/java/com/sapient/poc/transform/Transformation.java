package com.sapient.poc.transform;

import java.util.logging.Logger;

import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Component;

import com.sapient.poc.reader.Employee;

@Component
public class Transformation {
	
	private final static Logger LOGGER = Logger.getLogger(Transformation.class.getName());
	
	private ConsumerTemplate consumer;
	private ProducerTemplate producer; // used only for testing purpose
	
	public Transformation(ProducerTemplate producer, ConsumerTemplate consumer) {
		this.consumer = consumer;
		this.producer = producer;
	}
	
	public Employee transform() {
		Employee noEmployee = new Employee(0, "No Record", "No Record", 0L);
		Employee employee = (Employee) consumer.receiveBody("activemq:queue:transformQueue");
		LOGGER.info("Received message from transformQueue:"+employee);
		if(employee!=null && employee.getDesignation().equalsIgnoreCase("Manager")) {
			employee.setBonus(employee.getBonus()/2);
			//producer.sendBody("activemq:queue:transferQueue", employee);     //for testing purpose
			return employee;
		}
		//producer.sendBody("activemq:queue:transferQueue", noEmployee);	   //for testing purpose
		return noEmployee;
	}
	
	
}
