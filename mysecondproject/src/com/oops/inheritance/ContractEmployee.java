package com.oops.inheritance;

class ContractEmployee extends Employee {

	ContractEmployee(int empId, String empName, double basicSalary) {
		super(empId, empName, basicSalary);
	}

	@Override
	double calculateNetSalary() {
		return basicSalary;
	}
}


