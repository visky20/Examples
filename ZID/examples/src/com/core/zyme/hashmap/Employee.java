package com.core.zyme.hashmap;

public class Employee {
	
	private String empName;
	
	private int salary;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + "]";
	}

	public Employee(String empName, int salary) {
		super();
		this.empName = empName;
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
