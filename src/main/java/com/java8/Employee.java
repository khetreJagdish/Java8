package com.java8;

public class Employee {
	
	Integer empNumber;
	String empName;
	
	public Employee(Integer empNumber,String empName) {
		this.empNumber = empNumber;
		this.empName = empName;
	}
	
	public Integer getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", empName=" + empName + "]";
	}
		
		

}
