package com.oops;

class Microsoft{
	final String compName = "Microsoft";
	
	protected void displayInfo() {
		System.out.println("Displaying company name:- ");
	}
}
class Employee extends Microsoft
{
	int empId;
	String empName;
	String empCity;
	
	//creating parameterized constructor
	public Employee(int empId, String empName, String empCity) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
	}
	
	public void displayInfo() {
		System.out.println("Company Name:- "+compName);
		System.out.println("Employee Id:- "+empId);
		System.out.println("Employee Name:- "+empName);
		System.out.println("Employee City:- "+empCity);
	}
	
}
public class MethodOverridingEx {

	public static void main(String[] args) {
		Employee e1 = new Employee(10001, "Karuna","Ranchi");
		e1.displayInfo();

	}

}
