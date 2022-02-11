package com.rohit.rest.service;
import java.util.ArrayList;
import java.util.List;

import com.rohit.rest.model.Employee;
public class EmployeeService {
	
	static List<Employee> emplst= new ArrayList<Employee>(); 
	
	
	public List <Employee> getallEmployee(){
		
		return emplst;

	}
	
	
	
	public List<Employee>  addEmployee(Employee emp){
		emplst.add(emp);
		return emplst;
	}



	

}
