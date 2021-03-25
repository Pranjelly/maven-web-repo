package com.lti.view;

import com.lti.model.Employee;

public class EmpView {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEmp_id(100);
		e.setEmp_name("Harryyyyyyyyyyyy");
		
		System.out.println(e.getEmp_id());
		System.out.println(e.getEmp_name());
	}
}
