package com.sapient.poc.transform;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.poc.reader.Employee;

@RestController
public class TransformationService {
	
	private final static Logger LOGGER = Logger.getLogger(TransformationService.class.getName());
	
	@Autowired
	private Transformation transformation;
	
	@RequestMapping(value="/employeerule")
	public Employee transformEmployee() {
		LOGGER.info("***************Start transforming service******************");
		Employee employee = transformation.transform();
		LOGGER.info("***************End transforming service******************");
		return employee;
	}
}
