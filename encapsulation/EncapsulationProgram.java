package com.oops.encapsulation;

class Employee {
	int empId;
	private String empName;
	String empEmail;
	String empMobNo;
	String empAddress;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpMobNo() {
		return empMobNo;
	}
	public void setEmpMobNo(String empMobNo) {
		this.empMobNo = empMobNo;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public void displayEmployeeInfo() {

		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Email: " + empEmail);
		System.out.println("Employee Mobile: " + empMobNo);
		System.out.println("Employee Address: " + empAddress);
	}

	
}
public class EncapsulationProgram {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(1001);
		e1.setEmpName("Chandan Kumar");
		e1.setEmpAddress("Noida");
		e1.setEmpEmail("chandankr151@gmail.com");
		e1.setEmpMobNo("9865432134");

		System.out.println("Employee Id: " + e1.getEmpId());
		System.out.println("Employee Name: " + e1.getEmpName());
		System.out.println("Employee Email: " + e1.getEmpEmail());
		System.out.println("Employee Address: " + e1.getEmpAddress());
		System.out.println("Employee Mobile No: " + e1.getEmpMobNo());


	}

}
