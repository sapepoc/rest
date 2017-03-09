package com.sapient.poc.reader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/api")
public class ReaderService {
	
	@Autowired
	private PushEmployee employeeTest;
	
	@GET
	@Path("/employee")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployee() throws InterruptedException {
		Thread.sleep(1000);
		return Response.ok(employeeTest.print()).build();
	}
}
