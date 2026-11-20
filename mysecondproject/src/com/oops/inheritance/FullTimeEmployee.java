package com.oops.inheritance;

class FullTimeEmployee extends Employee {

	FullTimeEmployee(int empId, String empName, double basicSalary) {
		super(empId, empName, basicSalary);
	}

	@Override
	double calculateNetSalary() {
		return basicSalary + (basicSalary * 0.20) + (basicSalary * 0.10);
	}
}