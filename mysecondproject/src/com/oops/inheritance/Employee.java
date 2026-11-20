package com.oops.inheritance;

 class Employee {

		int empId;
		String empName;
		double basicSalary;

		Employee(int empId, String empName, double basicSalary) {
			this.empId = empId;
			this.empName = empName;
			this.basicSalary = basicSalary;
		}

		double calculateNetSalary() {
			return 0;
		}

		void display() {
			System.out.println("Employee ID   : " + empId);
			System.out.println("Employee Name : " + empName);
			System.out.println("Basic Salary  : " + basicSalary);
			System.out.println("Net Salary    : " + calculateNetSalary());
		}
	}


