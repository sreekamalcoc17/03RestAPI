package com.revature.rest.dao;

import java.util.ArrayList;
import java.util.List;

import com.reavature.rest.Employee;

public class EmployeeDaoimpl implements EmployeeDao{

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101,"abc");
		Employee e2 = new Employee(102,"def");
		List<Employee> lst = new ArrayList<Employee>();
		lst.add(e1);
		lst.add(e2);
		return lst;
	}
	
}
