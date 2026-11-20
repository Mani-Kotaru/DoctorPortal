package com.oops.inheritance;

class PartTimeEmployee extends Employee {

	PartTimeEmployee(int empId, String empName, double basicSalary) {
		super(empId, empName, basicSalary);
	}

	@Override
	double calculateNetSalary() {
		return basicSalary + (basicSalary * 0.05);
	}
}



