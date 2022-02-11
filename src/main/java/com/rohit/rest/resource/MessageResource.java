package com.rohit.rest.resource;

import com.rohit.rest.model.Employee;
import com.rohit.rest.service.EmployeeService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

@Path("/messages")
public class MessageResource {
	
	EmployeeService empsvc= new EmployeeService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getMessages() {
		
		return empsvc.getallEmployee();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<Employee> createMessage(Employee emp) {
		
		
		emp.setId(emp.getId()+1);
	   List<Employee> lst= empsvc.addEmployee(emp);
		return lst;
}
}