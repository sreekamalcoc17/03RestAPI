package com.reavature.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.rest.dao.EmployeeDao;
import com.revature.rest.dao.EmployeeDaoimpl;

@Path("controller")
public class MyController {
	
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello() {
		return "hello";
	}
	
	@GET
	@Path("/employee")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployees() {
		ObjectMapper mapper = new ObjectMapper();
		EmployeeDao emp = new EmployeeDaoimpl();
		List<Employee> lstemp = emp.getEmployees();
		
		try {
			return mapper.writeValueAsString(lstemp);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			 return e.getMessage();
		}

	}
}
