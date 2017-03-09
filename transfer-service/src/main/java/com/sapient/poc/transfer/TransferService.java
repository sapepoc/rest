package com.sapient.poc.transfer;


import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.poc.reader.Employee;

@RestController()
public class TransferService {
	
	private final static Logger LOGGER = Logger.getLogger(TransferService.class.getName());
	
	@Autowired
	private Transfer transfer;
	
	@RequestMapping(value="/employeetransfer")
	public Employee transferEmployee() {
		LOGGER.info("***************Start TransferRest logic******************");
		Employee list =  transfer.getEmployees();
		LOGGER.info("***************End TransferRest logic******************");
		return list;
	}
}
